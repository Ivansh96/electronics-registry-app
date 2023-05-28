package com.test.consumerelectronicsregistry.rest;

import com.test.consumerelectronicsregistry.dal.dto.ModelCreateDto;
import com.test.consumerelectronicsregistry.dal.dto.ModelReadDto;
import com.test.consumerelectronicsregistry.dal.dto.response.ModelResponse;
import com.test.consumerelectronicsregistry.filter.*;
import com.test.consumerelectronicsregistry.service.ElectronicsRegistryFilterService;
import com.test.consumerelectronicsregistry.util.exception.ModelNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.groups.Default;
import java.util.ArrayList;
import java.util.UUID;


@RestController
@RequestMapping("/api/v1/models")
@RequiredArgsConstructor
public class ModelRestController {
    private final ElectronicsRegistryFilterService filterService;

    @GetMapping("/filters")
    public ModelResponse getModelsByFilters(ModelsSearchFilter filter) {
        return new ModelResponse(new ArrayList<>(filterService.findAllByFilter(filter)));
    }
    @GetMapping("/price-filter")
    public ModelResponse getModelsByPrice(Integer from, Integer to) {
        return new ModelResponse(new ArrayList<>(filterService.findAllByPriceBetween(from, to)));
    }
    @GetMapping("/category/tv")
    public ModelResponse getTvModels(TvSearchFilter filter) {
        return new ModelResponse(new ArrayList<>(filterService.tvFilterAttributes(filter)));
    }
    @GetMapping("/category/pc")
    public ModelResponse getPcModels(PcSearchFilter filter) {
        return new ModelResponse(new ArrayList<>(filterService.pcFilterAttributes(filter)));
    }
    @GetMapping("/category/smartphone")
    public ModelResponse getSmartphoneModels(SmartphoneSearchFilter filter) {
        return new ModelResponse(new ArrayList<>(filterService.smartphoneFilterAttributes(filter)));
    }
    @GetMapping("/category/fridge")
    public ModelResponse getFridgeModels(FridgeSearchFilter filter) {
        return new ModelResponse(new ArrayList<>(filterService.fridgeFilterAttributes(filter)));
    }
    @GetMapping("/category/vacuum")
    public ModelResponse getVacuumModels(VacuumSearchFilter filter) {
        return new ModelResponse(new ArrayList<>(filterService.vacuumFilterAttributes(filter)));
    }
    @GetMapping("/{id}")
    public ModelReadDto getModelById(@PathVariable("id") UUID id) {
        return filterService.findById(id)
                .orElseThrow(ModelNotFoundException::new);
    }
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ModelReadDto addModel(@Validated({Default.class}) @RequestBody ModelCreateDto model) {
        return filterService.create(model);
    }
}
