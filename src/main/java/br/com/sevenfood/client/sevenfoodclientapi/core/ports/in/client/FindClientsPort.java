package br.com.sevenfood.client.sevenfoodclientapi.core.ports.in.client;

import br.com.sevenfood.client.sevenfoodclientapi.core.domain.Client;

import java.util.List;

public interface FindClientsPort {
    List<Client> findAll();
}
