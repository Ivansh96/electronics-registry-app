package com.test.consumerelectronicsregistry.service;

import com.test.consumerelectronicsregistry.dal.dto.ElectronicsCreateDto;
import com.test.consumerelectronicsregistry.dal.dto.ElectronicsReadDto;
import com.test.consumerelectronicsregistry.dal.dto.ModelCreateDto;
import com.test.consumerelectronicsregistry.dal.dto.ModelReadDto;
import com.test.consumerelectronicsregistry.dal.repository.ElectronicsRegistryRepository;
import com.test.consumerelectronicsregistry.dal.repository.ModelRepository;
import com.test.consumerelectronicsregistry.filter.*;
import com.test.consumerelectronicsregistry.mapper.ElectronicsCreateMapper;
import com.test.consumerelectronicsregistry.mapper.ElectronicsReadMapper;
import com.test.consumerelectronicsregistry.mapper.ModelCreateMapper;
import com.test.consumerelectronicsregistry.mapper.ModelReadMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ElectronicsRegistryFilterService {
    private final ModelRepository modelRepository;
    private final ElectronicsRegistryRepository registryRepository;
    private final ElectronicsCreateMapper elCreateMapper;
    private final ElectronicsReadMapper elReadMapper;
    private final ModelCreateMapper mCreateMapper;
    private final ModelReadMapper mReadMapper;


    public Optional<ModelReadDto> findById(UUID id) {
        return modelRepository.findById(id)
                .map(mReadMapper::map);
    }

    public ElectronicsReadDto create(ElectronicsCreateDto electronicsDto) {
        return Optional.ofNullable(electronicsDto)
                .map(elCreateMapper::map)
                .map(registryRepository::save)
                .map(elReadMapper::map)
                .orElseThrow();
    }

    public ModelReadDto create(ModelCreateDto modelDto) {
        return Optional.ofNullable(modelDto)
                .map(mCreateMapper::map)
                .map(modelRepository::save)
                .map(mReadMapper::map)
                .orElseThrow();
    }

    public List<ModelReadDto> findAllByPriceBetween(Integer from, Integer to) {
        return modelRepository.findAllByPriceBetweenOrderByPrice(from, to)
                .stream()
                .map(mReadMapper::map)
                .collect(Collectors.toList());
    }
    public List<ModelReadDto> findAllByFilter(ModelsSearchFilter filter) {
        return modelRepository.findAllByFilters(filter)
                .stream()
                .map(mReadMapper::map)
                .collect(Collectors.toList());
    }

    public List<ModelReadDto> tvFilterAttributes(TvSearchFilter filter) {
        return modelRepository.tvFilterAttributes(filter)
                .stream()
                .map(mReadMapper::map)
                .collect(Collectors.toList());
    }
    public List<ModelReadDto> smartphoneFilterAttributes(SmartphoneSearchFilter filter) {
        return modelRepository.smartphoneFilterAttributes(filter)
                .stream()
                .map(mReadMapper::map)
                .collect(Collectors.toList());
    }

    public List<ModelReadDto> pcFilterAttributes(PcSearchFilter filter) {
        return modelRepository.pcFilterAttributes(filter)
                .stream()
                .map(mReadMapper::map)
                .collect(Collectors.toList());
    }

    public List<ModelReadDto> fridgeFilterAttributes(FridgeSearchFilter filter) {
        return modelRepository.fridgeFilterAttributes(filter)
                .stream()
                .map(mReadMapper::map)
                .collect(Collectors.toList());
    }

    public List<ModelReadDto> vacuumFilterAttributes(VacuumSearchFilter filter) {
        return modelRepository.vacuumFilterAttributes(filter)
                .stream()
                .map(mReadMapper::map)
                .collect(Collectors.toList());
    }
    public List<ElectronicsReadDto> registryFilterAttributes(ElectronicsRegistrySearchFilter filter) {
        return registryRepository.registryFilterAttributes(filter)
                .stream()
                .map(elReadMapper::map)
                .collect(Collectors.toList());
    }

}
