package com.test.consumerelectronicsregistry.dal.dto.response;

import com.test.consumerelectronicsregistry.dal.dto.ElectronicsReadDto;

import lombok.Value;

import java.util.List;
@Value
public class ElectronicsResponse {
    List<ElectronicsReadDto> electronics;
}
