package br.com.sevenfood.client.sevenfoodclientapi.core.ports.in.clienttype;

import br.com.sevenfood.client.sevenfoodclientapi.core.domain.ClientType;

public interface UpdateClientTypePort {
    ClientType update(Long id, ClientType clientType);
}
