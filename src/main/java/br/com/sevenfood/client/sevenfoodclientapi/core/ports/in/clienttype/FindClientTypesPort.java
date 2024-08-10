package br.com.sevenfood.client.sevenfoodclientapi.core.ports.in.clienttype;

import br.com.sevenfood.client.sevenfoodclientapi.core.domain.ClientType;

import java.util.List;

public interface FindClientTypesPort {
    List<ClientType> findAll();
}
