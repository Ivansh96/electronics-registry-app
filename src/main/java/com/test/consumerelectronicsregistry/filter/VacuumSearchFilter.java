package com.test.consumerelectronicsregistry.filter;

import lombok.Value;

@Value
public class VacuumSearchFilter {
    String name;
    Integer sizeOfDustCollector;
    Integer numberOfModes;
    Integer serialNumber;
    String colour;
    Integer price;
    Integer size;
    String modelInStock;
}
