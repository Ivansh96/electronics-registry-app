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
    @Column(name = "наименование")
    private String name;
    @Column(name = "серийный_номер")
    private Integer serialNumber;
    @Column(name = "цвет")
    private String colour;
    @Column(name = "размер")
    private Integer size;
    @Column(name = "цена")
    private Integer price;
    @Column(name = "модель_на_складе")
    private String modelInStock;
    @Column(name = "категория_тв")
    private String tvCategory;
    @Column(name = "технология_тв")
    private String tvTechnology;
    @Column(name = "память_смартфона")
    private Integer smartphoneMemory;
    @Column(name = "количество_камер")
    private Integer numberOfCameras;
    @Column(name = "категория_пк")
    private String pcCategory;
    @Column(name = "тип_процессора")
    private String processor;
    @Column(name = "количество_дверей")
    private Integer numberOfDoors;
    @Column(name = "тип_компрессора")
    private String compressor;
    @Column(name = "объем_пылесборника")
    private Integer sizeOfDustCollector;
    @Column(name = "количество_режимов")
    private Integer numberOfModes;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "вид_техники", referencedColumnName = "id")
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
