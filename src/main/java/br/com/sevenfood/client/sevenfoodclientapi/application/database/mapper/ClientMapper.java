package br.com.sevenfood.client.sevenfoodclientapi.application.database.mapper;

import br.com.sevenfood.client.sevenfoodclientapi.core.domain.Client;
import br.com.sevenfood.client.sevenfoodclientapi.infrastructure.entity.client.ClientEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "pic", target = "pic")
    @Mapping(source = "clientTypeId", target = "clientTypeEntity.id")
    ClientEntity fromModelTpEntity(Client client);

    @InheritInverseConfiguration
    @Mapping(target = "id", source = "id")
    @Mapping(target = "code", source = "code")
    @Mapping(target = "clientTypeId", source = "clientTypeEntity.id")
    Client fromEntityToModel(ClientEntity clientEntity);

    List<Client> map(List<ClientEntity> clientEntities);
}
