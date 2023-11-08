package com.kamijoucen.powerstruct.config;

import com.kamijoucen.powerstruct.config.behavior.RuntimeContextFactory;
import com.kamijoucen.powerstruct.executor.ExeExecutor;

public interface StructConfiguration {

    ExeExecutor getExecutor();

    RuntimeContextFactory getRuntimeContextFactory();

    
}
