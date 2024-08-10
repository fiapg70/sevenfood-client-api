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
    @Mapping(source = "email", target = "email")
    @Mapping(source = "mobile", target = "mobile")
    @Mapping(source = "pic", target = "pic")
    @Mapping(source = "socialId", target = "socialId")
    @Mapping(source = "address", target = "address")
    @Mapping(source = "dataProcessingConsent", target = "dataProcessingConsent")
    @Mapping(source = "clientTypeId", target = "clientTypeEntity.id")
    ClientEntity fromModelTpEntity(Client client);

    @InheritInverseConfiguration
    @Mapping(target = "id", source = "id")
    @Mapping(target = "code", source = "code")
    @Mapping(target = "clientTypeId", source = "clientTypeEntity.id")
    @Mapping(target = "socialId", source = "socialId")
    @Mapping(target = "email", source = "email")
    Client fromEntityToModel(ClientEntity clientEntity);

    List<Client> map(List<ClientEntity> clientEntities);
}
