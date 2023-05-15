package com.test.consumerelectronicsregistry.filter;

import lombok.Value;

@Value
public class TvSearchFilter {
    String name;
    String tvCategory;
    String tvTechnology;
    Integer serialNumber;
    String colour;
    Integer price;
    Integer size;
    String modelInStock;
}
