package com.kamijoucen.powerstruct.config.behavior;

import com.kamijoucen.powerstruct.config.StructConfiguration;
import com.kamijoucen.powerstruct.context.RuntimeContext;
import com.kamijoucen.powerstruct.context.RuntimeContextImpl;

public class RuntimeContextFactory {

    private final StructConfiguration configuration;
    
    public RuntimeContextFactory(StructConfiguration configuration) {
        this.configuration = configuration;
    }

    public RuntimeContext create() {
        return new RuntimeContextImpl(this.configuration);
    }
    
}
