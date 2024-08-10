package br.com.sevenfood.client.sevenfoodclientapi.application.database.mapper;

import br.com.sevenfood.client.sevenfoodclientapi.core.domain.ClientType;
import br.com.sevenfood.client.sevenfoodclientapi.infrastructure.entity.clienttype.ClientTypeEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientTypeMapper {

    @Mapping(source = "name", target = "name")
    ClientTypeEntity fromModelTpEntity(ClientType clientType);

    @InheritInverseConfiguration
    @Mapping(target = "id", source = "id")
    ClientType fromEntityToModel(ClientTypeEntity productCategoryEntity);

    List<ClientType> map(List<ClientTypeEntity> productCategoryEntities);
}
