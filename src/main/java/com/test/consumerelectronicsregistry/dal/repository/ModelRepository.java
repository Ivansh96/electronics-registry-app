package com.test.consumerelectronicsregistry.dal.repository;

import com.test.consumerelectronicsregistry.dal.entity.ModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface ModelRepository extends JpaRepository<ModelEntity, UUID>, FilterRegistryRepository {
    List<ModelEntity> findAllByPriceBetweenOrderByPrice(Integer from, Integer to);
}
