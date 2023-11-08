package com.kamijoucen.powerstruct.api.impl;

import java.util.Objects;

import com.kamijoucen.powerstruct.api.ExecutionService;
import com.kamijoucen.powerstruct.config.StructConfiguration;
import com.kamijoucen.powerstruct.context.RuntimeContext;
import com.kamijoucen.powerstruct.exe.Exe;
import com.kamijoucen.powerstruct.executor.ExeExecutor;

public class ExecutionServiceImpl implements ExecutionService {
    
    private final StructConfiguration configuration;

    public ExecutionServiceImpl(StructConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public <R> R execute(Exe<R> execution) {
        ExeExecutor executor = configuration.getExecutor();
        Objects.requireNonNull(executor, "Executor is null");

        RuntimeContext runtimeContext = configuration.getRuntimeContextFactory().create();
        Objects.requireNonNull(runtimeContext, "RuntimeContext is null");
    
        return executor.execute(execution, runtimeContext);
    }


}
