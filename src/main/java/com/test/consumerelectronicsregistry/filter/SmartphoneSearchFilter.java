package com.test.consumerelectronicsregistry.filter;

import lombok.Value;

@Value
public class SmartphoneSearchFilter {
    String name;
    Integer smartphoneMemory;
    Integer numberOfCameras;
    Integer serialNumber;
    String colour;
    Integer price;
    Integer size;
    String modelInStock;
}
