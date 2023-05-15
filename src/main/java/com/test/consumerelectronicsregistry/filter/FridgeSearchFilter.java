package com.test.consumerelectronicsregistry.filter;

import lombok.Value;

@Value
public class FridgeSearchFilter {
    String name;
    Integer numberOfDoors;
    String compressor;
    Integer serialNumber;
    String colour;
    Integer price;
    Integer size;
    String modelInStock;
}
