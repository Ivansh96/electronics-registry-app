package com.test.consumerelectronicsregistry.dal.dto;

import lombok.Value;

import javax.validation.constraints.Size;
@Value
public class ModelCreateDto {
    String name;
    Integer serialNumber;
    String colour;
    Integer size;
    Integer price;
    @Size(min = 2, max = 3)
    String modelInStock;
    String tvCategory;
    String tvTechnology;
    Integer smartphoneMemory;
    Integer numberOfCameras;
    String pcCategory;
    String processor;
    Integer numberOfDoors;
    String compressor;
    Integer sizeOfDustCollector;
    Integer numberOfModes;
    ElectronicsCreateDto type;
}
