package com.test.consumerelectronicsregistry.mapper;

import com.test.consumerelectronicsregistry.dal.dto.ElectronicsCreateDto;
import com.test.consumerelectronicsregistry.dal.dto.ModelCreateDto;
import com.test.consumerelectronicsregistry.dal.entity.ElectronicsEntity;
import com.test.consumerelectronicsregistry.dal.entity.ModelEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
@RequiredArgsConstructor
public class ModelCreateMapper implements Mapper<ModelCreateDto, ModelEntity> {

    private final ElectronicsCreateMapper electronicsCreateMapper;
    @Override
    public ModelEntity map(ModelCreateDto object) {
        ModelEntity model = new ModelEntity();
        model.setName(object.getName());
        model.setSerialNumber(object.getSerialNumber());
        model.setColour(object.getColour());
        model.setSize(object.getSize());
        model.setPrice(object.getPrice());
        model.setModelInStock(object.getModelInStock());
        model.setTvCategory(object.getTvCategory());
        model.setTvTechnology(object.getTvTechnology());
        model.setSmartphoneMemory(object.getSmartphoneMemory());
        model.setNumberOfCameras(object.getNumberOfCameras());
        model.setPcCategory(object.getPcCategory());
        model.setProcessor(object.getProcessor());
        model.setNumberOfDoors(object.getNumberOfDoors());
        model.setCompressor(object.getCompressor());
        model.setSizeOfDustCollector(object.getSizeOfDustCollector());
        model.setNumberOfModes(object.getNumberOfModes());
        model.setType(getType(object.getType()));
        return model;
    }


    private ElectronicsEntity getType(ElectronicsCreateDto createDto) {
        return Optional.ofNullable(createDto)
                .map(electronicsCreateMapper::map)
                .orElse(null);
    }
}
