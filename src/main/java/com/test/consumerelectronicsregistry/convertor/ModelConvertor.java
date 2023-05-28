package com.test.consumerelectronicsregistry.convertor;

import com.test.consumerelectronicsregistry.dal.dto.ModelCreateDto;
import com.test.consumerelectronicsregistry.dal.dto.ModelReadDto;
import com.test.consumerelectronicsregistry.dal.entity.ModelEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ModelConvertor {
    private final ModelMapper modelMapper;

    public ModelReadDto toModelReadDto(ModelEntity entity) {
        return modelMapper.map(entity, ModelReadDto.class);
    }
    public ModelEntity toModelEntity(ModelCreateDto dto) {
        return modelMapper.map(dto, ModelEntity.class);
    }
}
