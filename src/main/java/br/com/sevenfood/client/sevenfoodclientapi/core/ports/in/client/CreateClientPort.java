package br.com.sevenfood.client.sevenfoodclientapi.core.ports.in.client;

import br.com.sevenfood.client.sevenfoodclientapi.core.domain.Client;

public interface CreateClientPort {
    Client save(Client client);
}
