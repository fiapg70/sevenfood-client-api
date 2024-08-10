package br.com.sevenfood.client.sevenfoodclientapi.core.ports.out;

import br.com.sevenfood.client.sevenfoodclientapi.core.domain.Client;

import java.util.List;

public interface ClientRepositoryPort {
    Client save(Client client);
    boolean remove(Long id);
    Client findById(Long id);
    List<Client> findAll();
    Client update(Long id, Client client);
    Client findByCode(String code);
    Client findByName(String name);
    Client findByEmail(String email);
}
