package com.test.consumerelectronicsregistry.mapper;

import com.test.consumerelectronicsregistry.dal.dto.ElectronicsReadDto;
import com.test.consumerelectronicsregistry.dal.entity.ElectronicsEntity;
import org.springframework.stereotype.Component;

@Component
public class ElectronicsReadMapper implements Mapper<ElectronicsEntity, ElectronicsReadDto> {
    @Override
    public ElectronicsReadDto map(ElectronicsEntity object) {
        return new ElectronicsReadDto(
                object.getId(),
                object.getName(),
                object.getCountry(),
                object.getBrand(),
                object.getOnlineOrder(),
                object.getCredit()
        );
    }
}
