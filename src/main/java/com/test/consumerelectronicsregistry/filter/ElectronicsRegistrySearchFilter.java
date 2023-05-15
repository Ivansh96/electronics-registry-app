package com.test.consumerelectronicsregistry.filter;

import lombok.Value;

@Value
public class ElectronicsRegistrySearchFilter {
    String name;
    String country;
    String brand;
    String onlineOrder;
    String credit;
}
