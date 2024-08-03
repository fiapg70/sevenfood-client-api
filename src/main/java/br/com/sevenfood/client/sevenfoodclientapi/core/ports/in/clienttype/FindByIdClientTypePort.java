package br.com.sevenfood.client.sevenfoodclientapi.core.ports.in.clienttype;

import br.com.sevenfood.client.sevenfoodclientapi.core.domain.ClientType;

public interface FindByIdClientTypePort {
    ClientType findById(Long id);
}
