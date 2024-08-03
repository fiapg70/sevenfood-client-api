package br.com.sevenfood.client.sevenfoodclientapi.core.service;

import br.com.sevenfood.client.sevenfoodclientapi.application.api.exception.ResourceFoundException;
import br.com.sevenfood.client.sevenfoodclientapi.core.domain.ClientType;
import br.com.sevenfood.client.sevenfoodclientapi.core.ports.in.clienttype.*;
import br.com.sevenfood.client.sevenfoodclientapi.core.ports.out.ClientTypeRepositoryPort;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ClientTypeService implements CreateClientTypePort, UpdateClientTypePort, FindByIdClientTypePort, FindClientTypesPort, DeleteClientTypePort {

    private final ClientTypeRepositoryPort clientTypeRepository;

    @Override
    public ClientType save(ClientType clientType) {
        return clientTypeRepository.save(clientType);
    }

    @Override
    public ClientType update(Long id, ClientType product) {
        ClientType resultById = findById(id);
        if (resultById != null) {
            resultById.update(id, product);

            return clientTypeRepository.save(resultById);
        }

        return null;
    }

    @Override
    public ClientType findById(Long id) {
        return clientTypeRepository.findById(id);
    }

    @Override
    public List<ClientType> findAll() {
       return clientTypeRepository.findAll();
    }

    @Override
    public boolean remove(Long id) {
        try {
            ClientType clientTypeById = findById(id);
            if (clientTypeById == null) {
                throw new ResourceFoundException("Product Category not found");
            }

            clientTypeRepository.remove(id);
            return Boolean.TRUE;
        } catch (ResourceFoundException e) {
            log.error("Erro ao remover produto: {}", e.getMessage());
            return Boolean.FALSE;
        }
    }
}
