package br.com.sevenfood.client.sevenfoodclientapi.core.service;

import br.com.sevenfood.client.sevenfoodclientapi.application.api.exception.ResourceFoundException;
import br.com.sevenfood.client.sevenfoodclientapi.core.domain.Client;
import br.com.sevenfood.client.sevenfoodclientapi.core.ports.in.client.*;
import br.com.sevenfood.client.sevenfoodclientapi.core.ports.out.ClientRepositoryPort;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClientService implements CreateClientPort, UpdateClientPort, FindByIdClientPort, FindClientsPort, DeleteClientPort {

    private final ClientRepositoryPort productRepository;

    @Override
    public Client save(Client product) {
        return productRepository.save(product);
    }

    @Override
    public Client update(Long id, Client product) {
        Client resultById = findById(id);
        if (resultById != null) {
            resultById.update(id, product);

            return productRepository.save(resultById);
        }

        return null;
    }

    @Override
    public Client findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Client findByCode(String code) {
        return productRepository.findByCode(code);
    }

    @Override
    public List<Client> findAll() {
       return productRepository.findAll();
    }

    @Override
    public boolean remove(Long id) {
        try {
            Client productById = findById(id);
            if (productById == null) {
                throw new ResourceFoundException("Client not found");
            }

            productRepository.remove(id);
            return Boolean.TRUE;
        } catch (ResourceFoundException e) {
            log.error("Erro ao remover produto: {}", e.getMessage());
            return Boolean.FALSE;
        }
    }
}
