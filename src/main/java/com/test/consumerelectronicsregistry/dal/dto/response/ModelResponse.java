package com.test.consumerelectronicsregistry.dal.dto.response;

import com.test.consumerelectronicsregistry.dal.dto.ModelReadDto;
import lombok.Value;

import java.util.List;
@Value
public class ModelResponse {
    List<ModelReadDto> models;
}
