package com.example.modulithdemo;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

class ModularityTests {
    private final ApplicationModules modules = ApplicationModules.of(ModulithDemoApplication.class);

    @Test
    void verifyModularity() {
        modules.verify();
    }
}
