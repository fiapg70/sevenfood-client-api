package br.com.sevenfood.client.sevenfoodclientapi.core.ports.in.clienttype;

import br.com.sevenfood.client.sevenfoodclientapi.core.domain.ClientType;

public interface CreateClientTypePort {
    ClientType save(ClientType clientType);
}
