package com.test.consumerelectronicsregistry.intergration.repository;

import com.test.consumerelectronicsregistry.dal.repository.ModelRepository;
import com.test.consumerelectronicsregistry.intergration.annotation.IT;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;


@IT
@RequiredArgsConstructor
public class ModelRepositoryTest {
    private final ModelRepository modelRepository ;

    @Test
    void checkCustomFilters() {
    }

    @Test
    void checkJpaFilters() {
    }
}
