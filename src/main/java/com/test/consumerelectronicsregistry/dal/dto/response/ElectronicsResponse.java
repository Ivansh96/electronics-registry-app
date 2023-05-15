package com.test.consumerelectronicsregistry.dal.dto.response;

import com.test.consumerelectronicsregistry.dal.entity.ElectronicsEntity;
import lombok.Value;

import java.util.List;
@Value
public class ElectronicsResponse {
    List<ElectronicsEntity> electronics;
}
