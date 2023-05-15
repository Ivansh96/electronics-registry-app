package com.test.consumerelectronicsregistry.mapper;

import com.test.consumerelectronicsregistry.dal.dto.ElectronicsCreateDto;
import com.test.consumerelectronicsregistry.dal.entity.ElectronicsEntity;
import org.springframework.stereotype.Component;

@Component
public class ElectronicsCreateMapper implements Mapper<ElectronicsCreateDto, ElectronicsEntity> {
    @Override
    public ElectronicsEntity map(ElectronicsCreateDto object) {
        ElectronicsEntity electronics = new ElectronicsEntity();
        electronics.setName(object.getName());
        electronics.setCountry(object.getCountry());
        electronics.setBrand(object.getBrand());
        electronics.setOnlineOrder(object.getOnlineOrder());
        electronics.setCredit(object.getCredit());
        return electronics;
    }
}
