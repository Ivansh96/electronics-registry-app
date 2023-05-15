package com.test.consumerelectronicsregistry.filter;

import lombok.Value;

@Value
public class PcSearchFilter {
    String name;
    String pcCategory;
    String processor;
    Integer serialNumber;
    String colour;
    Integer price;
    Integer size;
    String modelInStock;
}
