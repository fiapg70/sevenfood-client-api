package br.com.sevenfood.client.sevenfoodclientapi.infrastructure.repository;

import br.com.sevenfood.client.sevenfoodclientapi.infrastructure.entity.clienttype.ClientTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientTypeRepository extends JpaRepository<ClientTypeEntity, Long> {
    Optional<ClientTypeEntity> findByName(String name);
}
