package com.test.consumerelectronicsregistry.dal.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "electronics_registry")
@Getter
@Setter
@NoArgsConstructor
public class ElectronicsEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(name = "наименование")
    private String name;

    @Column(name = "страна_производитель")
    private String country;

    @Column(name = "фирма_производитель")
    private String brand;
    @Column(name = "возможность_заказа_онлайн")
    private String onlineOrder;

    @Column(name = "возможность_оформления_рассрочки")
    private String credit;

    @OneToMany(mappedBy = "type",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER)
    private List<ModelEntity> models;
}
