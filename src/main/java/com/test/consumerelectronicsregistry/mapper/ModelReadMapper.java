package com.test.consumerelectronicsregistry.mapper;

import com.test.consumerelectronicsregistry.dal.dto.ModelReadDto;
import com.test.consumerelectronicsregistry.dal.entity.ModelEntity;
import org.springframework.stereotype.Component;

@Component
public class ModelReadMapper implements Mapper<ModelEntity, ModelReadDto> {
    @Override
    public ModelReadDto map(ModelEntity object) {
        return new ModelReadDto(
                object.getId(),
                object.getElectronicsType(),
                object.getName(),
                object.getSerialNumber(),
                object.getColor(),
                object.getSize(),
                object.getPrice(),
                object.getModelInStock(),
                object.getTvCategory(),
                object.getTvTechnology(),
                object.getSmartphoneMemory(),
                object.getNumberOfCameras(),
                object.getPcCategory(),
                object.getProcessor(),
                object.getNumberOfDoors(),
                object.getCompressor(),
                object.getSizeOfDustCollector(),
                object.getNumberOfModes()
        );
    }
}
