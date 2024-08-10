package br.com.sevenfood.client.sevenfoodclientapi.core.ports.in.client;

import br.com.sevenfood.client.sevenfoodclientapi.application.api.exception.ResourceFoundException;
import br.com.sevenfood.client.sevenfoodclientapi.core.domain.Client;

public interface CreateClientPort {
    Client save(Client client) throws ResourceFoundException;
}
