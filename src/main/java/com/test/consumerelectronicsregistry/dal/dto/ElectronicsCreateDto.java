package com.test.consumerelectronicsregistry.dal.dto;

import com.test.consumerelectronicsregistry.validation.ElectronicsInfo;
import lombok.Value;

import javax.validation.constraints.Size;
@Value
@ElectronicsInfo
public class ElectronicsCreateDto {

    String name;
    String country;
    String brand;
    @Size(min = 2, max = 3)
    String onlineOrder;
    @Size(min = 2, max = 3)
    String credit;
}
