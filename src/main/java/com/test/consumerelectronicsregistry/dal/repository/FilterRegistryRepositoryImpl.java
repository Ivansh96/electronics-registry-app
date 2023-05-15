package com.test.consumerelectronicsregistry.dal.repository;

import com.querydsl.jpa.impl.JPAQuery;
import com.test.consumerelectronicsregistry.dal.entity.ElectronicsEntity;
import com.test.consumerelectronicsregistry.dal.entity.ModelEntity;
import com.test.consumerelectronicsregistry.dal.entity.QElectronicsEntity;
import com.test.consumerelectronicsregistry.dal.entity.QModelEntity;
import com.test.consumerelectronicsregistry.dal.querydsl.QPredicates;
import com.test.consumerelectronicsregistry.filter.*;
import lombok.RequiredArgsConstructor;

import javax.persistence.EntityManager;
import java.util.List;

import static com.test.consumerelectronicsregistry.dal.entity.QElectronicsEntity.electronicsEntity;
import static com.test.consumerelectronicsregistry.dal.entity.QModelEntity.*;

@RequiredArgsConstructor
public class FilterRegistryRepositoryImpl implements FilterRegistryRepository {

    private final EntityManager entityManager;


    @Override
    public List<ModelEntity> findAllByFilters(ModelsSearchFilter filter) {
        var predicates = QPredicates.builder()
                .add(filter.getType(), modelEntity.type.name::containsIgnoreCase)
                .add(filter.getName(), modelEntity.name::containsIgnoreCase)
                .add(filter.getColour(), modelEntity.colour::containsIgnoreCase)
                .build();
        return new JPAQuery<ModelEntity>(entityManager)
                .select(modelEntity)
                .from(modelEntity)
                .leftJoin(modelEntity.type, electronicsEntity)
                .where(predicates)
                .orderBy(modelEntity.price.asc())
                .fetch();
    }

    @Override
    public List<ModelEntity> tvFilterAttributes(TvSearchFilter filter) {
        var predicates = QPredicates.builder()
                .add(filter.getName(), modelEntity.name::containsIgnoreCase)
                .add(filter.getTvCategory(), modelEntity.tvCategory::containsIgnoreCase)
                .add(filter.getTvTechnology(), modelEntity.tvTechnology::containsIgnoreCase)
                .add(filter.getSerialNumber(), modelEntity.serialNumber::eq)
                .add(filter.getColour(), modelEntity.colour::containsIgnoreCase)
                .add(filter.getPrice(), modelEntity.price::eq)
                .add(filter.getSize(), modelEntity.size::eq)
                .add(filter.getModelInStock(), modelEntity.modelInStock::containsIgnoreCase)
                .build();
        return new JPAQuery<ModelEntity>(entityManager)
                .select(modelEntity)
                .from(modelEntity)
                .where(predicates)
                .orderBy(modelEntity.price.asc())
                .fetch();
    }

    @Override
    public List<ModelEntity> smartphoneFilterAttributes(SmartphoneSearchFilter filter) {
        var predicates = QPredicates.builder()
                .add(filter.getName(), modelEntity.name::containsIgnoreCase)
                .add(filter.getSmartphoneMemory(), modelEntity.smartphoneMemory::eq)
                .add(filter.getNumberOfCameras(), modelEntity.numberOfCameras::eq)
                .add(filter.getSerialNumber(), modelEntity.serialNumber::eq)
                .add(filter.getColour(), modelEntity.colour::containsIgnoreCase)
                .add(filter.getPrice(), modelEntity.price::eq)
                .add(filter.getSize(), modelEntity.size::eq)
                .add(filter.getModelInStock(), modelEntity.modelInStock::containsIgnoreCase)
                .build();
        return new JPAQuery<ModelEntity>(entityManager)
                .select(modelEntity)
                .from(modelEntity)
                .where(predicates)
                .orderBy(modelEntity.price.asc())
                .fetch();
    }

    @Override
    public List<ModelEntity> pcFilterAttributes(PcSearchFilter filter) {
        var predicates = QPredicates.builder()
                .add(filter.getName(), modelEntity.name::containsIgnoreCase)
                .add(filter.getPcCategory(), modelEntity.pcCategory::containsIgnoreCase)
                .add(filter.getProcessor(), modelEntity.processor::containsIgnoreCase)
                .add(filter.getSerialNumber(), modelEntity.serialNumber::eq)
                .add(filter.getColour(), modelEntity.colour::containsIgnoreCase)
                .add(filter.getPrice(), modelEntity.price::eq)
                .add(filter.getSize(), modelEntity.size::eq)
                .add(filter.getModelInStock(), modelEntity.modelInStock::containsIgnoreCase)
                .build();
        return new JPAQuery<ModelEntity>(entityManager)
                .select(modelEntity)
                .from(modelEntity)
                .where(predicates)
                .orderBy(modelEntity.price.asc())
                .fetch();
    }

    @Override
    public List<ModelEntity> fridgeFilterAttributes(FridgeSearchFilter filter) {
        var predicates = QPredicates.builder()
                .add(filter.getName(), modelEntity.name::containsIgnoreCase)
                .add(filter.getNumberOfDoors(), modelEntity.numberOfDoors::eq)
                .add(filter.getCompressor(), modelEntity.compressor::containsIgnoreCase)
                .add(filter.getSerialNumber(), modelEntity.serialNumber::eq)
                .add(filter.getColour(), modelEntity.colour::containsIgnoreCase)
                .add(filter.getPrice(), modelEntity.price::eq)
                .add(filter.getSize(), modelEntity.size::eq)
                .add(filter.getModelInStock(), modelEntity.modelInStock::containsIgnoreCase)
                .build();
        return new JPAQuery<ModelEntity>(entityManager)
                .select(modelEntity)
                .from(modelEntity)
                .where(predicates)
                .orderBy(modelEntity.price.asc())
                .fetch();
    }

    @Override
    public List<ModelEntity> vacuumFilterAttributes(VacuumSearchFilter filter) {
        var predicates = QPredicates.builder()
                .add(filter.getName(), modelEntity.name::containsIgnoreCase)
                .add(filter.getSizeOfDustCollector(), modelEntity.sizeOfDustCollector::eq)
                .add(filter.getNumberOfModes(), modelEntity.numberOfModes::eq)
                .add(filter.getSerialNumber(), modelEntity.serialNumber::eq)
                .add(filter.getColour(), modelEntity.colour::containsIgnoreCase)
                .add(filter.getPrice(), modelEntity.price::eq)
                .add(filter.getSize(), modelEntity.size::eq)
                .add(filter.getModelInStock(), modelEntity.modelInStock::containsIgnoreCase)
                .build();
        return new JPAQuery<ModelEntity>(entityManager)
                .select(modelEntity)
                .from(modelEntity)
                .where(predicates)
                .orderBy(modelEntity.price.asc())
                .fetch();
    }

    @Override
    public List<ElectronicsEntity> registryFilterAttributes(ElectronicsRegistrySearchFilter filter) {
        var predicates = QPredicates.builder()
                .add(filter.getName(), electronicsEntity.name::containsIgnoreCase)
                .add(filter.getCountry(), electronicsEntity.country::containsIgnoreCase)
                .add(filter.getBrand(), electronicsEntity.brand::containsIgnoreCase)
                .add(filter.getOnlineOrder(), electronicsEntity.onlineOrder::containsIgnoreCase)
                .add(filter.getCredit(), electronicsEntity.credit::containsIgnoreCase)
                .build();
        return new JPAQuery<ElectronicsEntity>(entityManager)
                .select(electronicsEntity)
                .from(electronicsEntity)
                .where(predicates)
                .orderBy(electronicsEntity.name.asc())
                .fetch();
    }
}
