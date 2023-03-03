package com.kamijoucen.powerstruct.exe;

import com.kamijoucen.powerstruct.context.ExeContext;
import com.kamijoucen.powerstruct.context.StructConfiguration;
import com.kamijoucen.powerstruct.executor.ExeExecutor;

public abstract class AbstractExe<R> implements Exe<R> {

    protected StructConfiguration configuration;

    protected ExeContext parentContext;

    protected ExeContext context;

    public AbstractExe(ExeContext parrentContext) {
        this.parentContext = parrentContext;
    }

    public AbstractExe(Exe<?> parrentExe) {
        this.parentContext = parrentExe.getContext();
    }


    @Override
    public ExeContext getParentContext() {
        return parentContext;
    }

    @Override
    public ExeContext getContext() {
        return context;
    }

    @Override
    public void setContext(ExeContext context) {
        this.context = context;
    }

    @Override
    public StructConfiguration getConfiguration() {
        return configuration;
    }

    @Override
    public void setConfiguration(StructConfiguration configuration) {
        this.configuration = configuration;
    }

    public ExeExecutor getExecutor() {
        return configuration.getExecutor();
    }


}
