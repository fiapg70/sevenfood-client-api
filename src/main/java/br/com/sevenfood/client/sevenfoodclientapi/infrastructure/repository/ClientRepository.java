package br.com.sevenfood.client.sevenfoodclientapi.infrastructure.repository;

import br.com.sevenfood.client.sevenfoodclientapi.infrastructure.entity.client.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
    ClientEntity findByCode(String code);
    ClientEntity findByName(String name);
}
