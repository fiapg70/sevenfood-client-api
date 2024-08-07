package br.com.sevenfood.client.sevenfoodclientapi.core.ports.in.client;

import br.com.sevenfood.client.sevenfoodclientapi.core.domain.Client;

public interface FindByIdClientPort {
    Client findById(Long id);
    Client findByCode(String code);
    Client findByEmail(String email);
}
