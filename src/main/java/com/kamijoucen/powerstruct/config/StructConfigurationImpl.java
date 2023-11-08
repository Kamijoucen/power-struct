package com.kamijoucen.powerstruct.config;

import com.kamijoucen.powerstruct.config.behavior.RuntimeContextFactory;
import com.kamijoucen.powerstruct.executor.DefaultExecutorImpl;
import com.kamijoucen.powerstruct.executor.ExeExecutor;
import com.kamijoucen.powerstruct.interceptor.ExeInvoker;
import com.kamijoucen.powerstruct.interceptor.TraceInterceptor;

public class StructConfigurationImpl implements StructConfiguration {

    private ExeExecutor executor;

    private RuntimeContextFactory runtimeContextFactory;

    public StructConfigurationImpl() {
        this.init();
    }

    private void init() {
        this.initExecutor();
        this.runtimeContextFactory = new RuntimeContextFactory(this);
    }

    public void initExecutor() {
        this.executor = new DefaultExecutorImpl();
        this.executor.addExeInterceptor(new TraceInterceptor());
        this.executor.addExeInterceptor(new ExeInvoker());
    }

    @Override
    public ExeExecutor getExecutor() {
        return executor;
    }

    public void setExecutor(ExeExecutor executor) {
        this.executor = executor;
    }

    @Override
    public RuntimeContextFactory getRuntimeContextFactory() {
        return this.runtimeContextFactory;
    }

    public void setRuntimeContextFactory(RuntimeContextFactory runtimeContextFactory) {
        this.runtimeContextFactory = runtimeContextFactory;
    }

}
