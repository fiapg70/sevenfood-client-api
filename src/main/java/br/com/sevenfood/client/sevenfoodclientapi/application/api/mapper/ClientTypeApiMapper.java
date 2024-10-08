package br.com.sevenfood.client.sevenfoodclientapi.application.api.mapper;

import br.com.sevenfood.client.sevenfoodclientapi.application.api.dto.request.ClientTypeRequest;
import br.com.sevenfood.client.sevenfoodclientapi.application.api.dto.response.ClientTypeResponse;
import br.com.sevenfood.client.sevenfoodclientapi.core.domain.ClientType;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientTypeApiMapper {

    @Mapping(source = "name", target = "name")
    ClientType fromRequest(ClientTypeRequest request);

    @InheritInverseConfiguration
    @Mapping(target = "id", source = "id")
    ClientTypeResponse fromEntity(ClientType clientType);

   List<ClientTypeResponse> map(List<ClientType> clientTypes);
}
