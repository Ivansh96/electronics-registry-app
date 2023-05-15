package com.test.consumerelectronicsregistry.rest;

import com.test.consumerelectronicsregistry.dal.dto.ElectronicsCreateDto;
import com.test.consumerelectronicsregistry.dal.dto.ElectronicsReadDto;
import com.test.consumerelectronicsregistry.dal.dto.response.ElectronicsResponse;
import com.test.consumerelectronicsregistry.filter.ElectronicsRegistrySearchFilter;
import com.test.consumerelectronicsregistry.service.ElectronicsRegistryFilterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.groups.Default;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/registry")
@RequiredArgsConstructor
public class ElectronicsRegistryRestController {

    private final ElectronicsRegistryFilterService filterService;

    @GetMapping("/filters")
    public ElectronicsResponse getType(ElectronicsRegistrySearchFilter filter) {
        return new ElectronicsResponse(new ArrayList<>(filterService.registryFilterAttributes(filter)));
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ElectronicsReadDto addEquipment(@Validated({Default.class}) @RequestBody ElectronicsCreateDto equipment) {
        return filterService.create(equipment);
    }
}
