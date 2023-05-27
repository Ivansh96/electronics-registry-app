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
    private String name;
    private String country;
    private String brand;
    @Column(name = "online_order")
    private String onlineOrder;
    private String credit;
    @OneToMany(mappedBy = "type",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER)
    private List<ModelEntity> models;
}
