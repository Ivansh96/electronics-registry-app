package com.test.consumerelectronicsregistry.dal.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.test.consumerelectronicsregistry.dal.dto.ElectronicsType;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "models")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ModelEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @JsonIgnore
    private UUID id;
    private String name;
    @Column(name = "serial_number")
    private Integer serialNumber;
    private String color;
    private Integer size;
    private Integer price;
    @Column(name = "model_in_stock")
    private String modelInStock;
    @Column(name = "tv_category")
    private String tvCategory;
    @Column(name = "tv_technology")
    private String tvTechnology;
    @Column(name = "memory")
    private Integer smartphoneMemory;
    @Column(name = "cameras_quantity")
    private Integer numberOfCameras;
    @Column(name = "pc_category")
    private String pcCategory;
    private String processor;
    @Column(name = "doors_quantity")
    private Integer numberOfDoors;
    private String compressor;
    @Column(name = "dust_collector_size")
    private Integer sizeOfDustCollector;
    @Column(name = "number_of_modes")
    private Integer numberOfModes;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type_id", referencedColumnName = "id")
    private ElectronicsEntity type;

    @Transient
    @JsonIgnore
    ElectronicsType electronicsType;
    @PrePersist
    protected void roleInit() {
        if(type.getName().equalsIgnoreCase("Телевизор")) {
            electronicsType = ElectronicsType.TV;
        }
        if(type.getName().equalsIgnoreCase("Смартфон")) {
            electronicsType = ElectronicsType.SMARTPHONE;
        }
        if(type.getName().equalsIgnoreCase("Компьютер")) {
            electronicsType = ElectronicsType.PC;
        }
        if(type.getName().equalsIgnoreCase("Холодильник")) {
            electronicsType = ElectronicsType.FRIDGE;
        }
        if(type.getName().equalsIgnoreCase("Пылесос")) {
            electronicsType = ElectronicsType.VACUUM;
        }
    }
}
