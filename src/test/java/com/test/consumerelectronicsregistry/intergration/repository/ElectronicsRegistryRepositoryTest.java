package com.test.consumerelectronicsregistry.intergration.repository;

import com.test.consumerelectronicsregistry.dal.repository.ElectronicsRegistryRepository;
import com.test.consumerelectronicsregistry.intergration.annotation.IT;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

@IT
@RequiredArgsConstructor
public class ElectronicsRegistryRepositoryTest {

    private final ElectronicsRegistryRepository repository;

    @Test
    void checkJpaMethods() {
    }
}
