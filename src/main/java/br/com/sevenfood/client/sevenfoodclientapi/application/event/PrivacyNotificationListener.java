package br.com.sevenfood.client.sevenfoodclientapi.application.event;

import br.com.sevenfood.client.sevenfoodclientapi.application.event.dto.MessageNotification;
import br.com.sevenfood.client.sevenfoodclientapi.application.event.dto.SNSNotification;
import br.com.sevenfood.client.sevenfoodclientapi.core.domain.Client;
import br.com.sevenfood.client.sevenfoodclientapi.core.ports.out.ClientRepositoryPort;
import br.com.sevenfood.client.sevenfoodclientapi.core.utils.JsonUtil;
import io.awspring.cloud.sqs.annotation.SqsListener;
import io.awspring.cloud.sqs.listener.acknowledgement.Acknowledgement;
import io.awspring.cloud.sqs.operations.SqsTemplate;
import lombok.extern.log4j.Log4j2;
import org.springframework.messaging.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class PrivacyNotificationListener {

    @Value("${aws.privacyNotification.queueName}")
    private String queueName;

    private final SqsTemplate sqsTemplate;
    private final ClientRepositoryPort clientRepositoryPort;

    @Autowired
    public PrivacyNotificationListener(SqsTemplate sqsTemplate, ClientRepositoryPort clientRepositoryPort) {
        this.sqsTemplate = sqsTemplate;
        this.clientRepositoryPort = clientRepositoryPort;
    }

    @SqsListener("${aws.privacyNotification.queueName}")
    public void listen(Message<?> message) {
        try {
            log.info("Message received from queue: {}", message);
            log.info("Message Payload: {}", message.getPayload());
            if (message != null && message.getPayload() != null) {
                String messagePayload = message.getPayload().toString();
                log.info("Message Payload: {}", messagePayload);

                SNSNotification snsNotification = JsonUtil.fromJson(messagePayload, SNSNotification.class);
                String snsMessage = snsNotification.getMessage();

                MessageNotification messageNotification = JsonUtil.jsonToObject(snsMessage, MessageNotification.class);
                if (messageNotification != null) {
                    log.info("Message Notification: {}", messageNotification);
                    String userName = messageNotification.requestId();
                    Client clientFound = clientRepositoryPort.findByCode(userName);
                    if (clientFound != null) {
                        log.info("Client Found: {}", clientFound);
                        clientRepositoryPort.remove(clientFound.getId());
                        Acknowledgement.acknowledge(message);
                    }
                }
            }
        } catch (Exception e) {
            log.error("Queue Exception Message: {}", e.getMessage());
        }
    }
}