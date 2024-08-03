package br.com.sevenfood.client.sevenfoodclientapi.core.ports.in.client;

import br.com.sevenfood.client.sevenfoodclientapi.core.domain.Client;

public interface UpdateClientPort {
    Client update(Long id, Client client);
}
