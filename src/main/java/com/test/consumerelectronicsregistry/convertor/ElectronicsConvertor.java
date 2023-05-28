package com.test.consumerelectronicsregistry.convertor;

import com.test.consumerelectronicsregistry.dal.dto.ElectronicsCreateDto;
import com.test.consumerelectronicsregistry.dal.dto.ElectronicsReadDto;
import com.test.consumerelectronicsregistry.dal.entity.ElectronicsEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ElectronicsConvertor {
    private final ModelMapper modelMapper;

    public ElectronicsReadDto toElectronicsReadDto(ElectronicsEntity entity) {
        return modelMapper.map(entity, ElectronicsReadDto.class);
    }
    public ElectronicsEntity toElectronicsEntity(ElectronicsCreateDto dto) {
        return modelMapper.map(dto, ElectronicsEntity.class);
    }
}
