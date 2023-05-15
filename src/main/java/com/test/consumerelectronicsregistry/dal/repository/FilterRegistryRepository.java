package com.test.consumerelectronicsregistry.dal.repository;

import com.test.consumerelectronicsregistry.dal.entity.ElectronicsEntity;
import com.test.consumerelectronicsregistry.dal.entity.ModelEntity;
import com.test.consumerelectronicsregistry.filter.*;

import java.util.List;

public interface FilterRegistryRepository {

    List<ModelEntity> findAllByFilters(ModelsSearchFilter filter);

    List<ModelEntity> tvFilterAttributes(TvSearchFilter filter);

    List<ModelEntity> smartphoneFilterAttributes(SmartphoneSearchFilter filter);

    List<ModelEntity> pcFilterAttributes(PcSearchFilter filter);

    List<ModelEntity> fridgeFilterAttributes(FridgeSearchFilter filter);

    List<ModelEntity> vacuumFilterAttributes(VacuumSearchFilter filter);

    List<ElectronicsEntity> registryFilterAttributes(ElectronicsRegistrySearchFilter filter);
}
