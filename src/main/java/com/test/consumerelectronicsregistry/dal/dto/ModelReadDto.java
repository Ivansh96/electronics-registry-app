package com.test.consumerelectronicsregistry.dal.dto;

import lombok.Value;

import java.util.UUID;

@Value
public class ModelReadDto {
    UUID id;
    ElectronicsType electronicsType;
    String name;
    Integer serialNumber;
    String colour;
    Integer size;
    Integer price;
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
}
