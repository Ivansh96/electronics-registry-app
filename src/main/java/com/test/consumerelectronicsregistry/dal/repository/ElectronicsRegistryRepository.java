package com.test.consumerelectronicsregistry.dal.repository;

import com.test.consumerelectronicsregistry.dal.entity.ElectronicsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ElectronicsRegistryRepository extends JpaRepository<ElectronicsEntity, UUID>, FilterRegistryRepository {
}
