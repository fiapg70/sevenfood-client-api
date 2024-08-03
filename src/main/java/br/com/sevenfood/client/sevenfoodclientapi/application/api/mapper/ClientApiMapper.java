package br.com.sevenfood.client.sevenfoodclientapi.application.api.mapper;

import br.com.sevenfood.client.sevenfoodclientapi.application.api.dto.request.ClientRequest;
import br.com.sevenfood.client.sevenfoodclientapi.application.api.dto.response.ClientResponse;
import br.com.sevenfood.client.sevenfoodclientapi.core.domain.Client;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientApiMapper {

    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "pic", target = "pic")
    @Mapping(source = "clientTypeId", target = "clientTypeId")
    Client fromRequest(ClientRequest request);

    @InheritInverseConfiguration
    @Mapping(target = "id", source = "id")
    @Mapping(target = "code", source = "code")
    ClientResponse fromEntity(Client client);

    List<ClientResponse> map(List<Client> clients);

}
