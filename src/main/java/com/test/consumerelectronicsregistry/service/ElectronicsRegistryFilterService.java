package com.test.consumerelectronicsregistry.service;

import com.test.consumerelectronicsregistry.convertor.ElectronicsConvertor;
import com.test.consumerelectronicsregistry.convertor.ModelConvertor;
import com.test.consumerelectronicsregistry.dal.dto.*;
import com.test.consumerelectronicsregistry.dal.repository.ElectronicsRegistryRepository;
import com.test.consumerelectronicsregistry.dal.repository.ModelRepository;
import com.test.consumerelectronicsregistry.filter.*;
import com.test.consumerelectronicsregistry.util.exception.ElectronicsTypeAlreadyExists;
import com.test.consumerelectronicsregistry.util.exception.ModelAlreadyExistsException;
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
    private final ModelConvertor modelConvertor;
    private final ElectronicsConvertor electronicsConvertor;


    public Optional<ModelReadDto> findById(UUID id) {
        return modelRepository.findById(id)
                .map(modelConvertor::toModelReadDto);
    }

    public ElectronicsReadDto create(ElectronicsCreateDto electronicsDto) {
        return Optional.ofNullable(electronicsDto)
                .map(electronicsConvertor::toElectronicsEntity)
                .map(registryRepository::save)
                .map(electronicsConvertor::toElectronicsReadDto)
                .orElseThrow(ElectronicsTypeAlreadyExists::new);
    }

    public ModelReadDto create(ModelCreateDto modelDto) {
        return Optional.ofNullable(modelDto)
                .map(modelConvertor::toModelEntity)
                .map(modelRepository::save)
                .map(modelConvertor::toModelReadDto)
                .orElseThrow(ModelAlreadyExistsException::new);
    }

    public List<ModelReadDto> findAllByPriceBetween(Integer from, Integer to) {
        return modelRepository.findAllByPriceBetweenOrderByPrice(from, to)
                .stream()
                .map(modelConvertor::toModelReadDto)
                .collect(Collectors.toList());
    }

    public List<ModelReadDto> findAllByFilter(ModelsSearchFilter filter) {
        return modelRepository.findAllByFilters(filter)
                .stream()
                .map(modelConvertor::toModelReadDto)
                .collect(Collectors.toList());
    }

    public List<ModelReadDto> tvFilterAttributes(TvSearchFilter filter) {
        return modelRepository.tvFilterAttributes(filter)
                .stream()
                .map(modelConvertor::toModelReadDto)
                .collect(Collectors.toList());
    }

    public List<ModelReadDto> smartphoneFilterAttributes(SmartphoneSearchFilter filter) {
        return modelRepository.smartphoneFilterAttributes(filter)
                .stream()
                .map(modelConvertor::toModelReadDto)
                .collect(Collectors.toList());
    }

    public List<ModelReadDto> pcFilterAttributes(PcSearchFilter filter) {
        return modelRepository.pcFilterAttributes(filter)
                .stream()
                .map(modelConvertor::toModelReadDto)
                .collect(Collectors.toList());
    }

    public List<ModelReadDto> fridgeFilterAttributes(FridgeSearchFilter filter) {
        return modelRepository.fridgeFilterAttributes(filter)
                .stream()
                .map(modelConvertor::toModelReadDto)
                .collect(Collectors.toList());
    }

    public List<ModelReadDto> vacuumFilterAttributes(VacuumSearchFilter filter) {
        return modelRepository.vacuumFilterAttributes(filter)
                .stream()
                .map(modelConvertor::toModelReadDto)
                .collect(Collectors.toList());
    }

    public List<ElectronicsReadDto> registryFilterAttributes(ElectronicsRegistrySearchFilter filter) {
        return registryRepository.registryFilterAttributes(filter)
                .stream()
                .map(electronicsConvertor::toElectronicsReadDto)
                .collect(Collectors.toList());
    }
}
