package com.test.consumerelectronicsregistry.dal.dto;

import lombok.Value;

import java.util.UUID;
@Value
public class ElectronicsReadDto {
    UUID id;
    String name;
    String country;
    String brand;
    String onlineOrder;
    String credit;
}
