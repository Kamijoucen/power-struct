package com.kamijoucen.powerstruct.context;

import com.kamijoucen.powerstruct.context.factory.ExeContextFactory;
import com.kamijoucen.powerstruct.executor.DefaultExecutorImpl;
import com.kamijoucen.powerstruct.executor.ExeExecutor;
import com.kamijoucen.powerstruct.interceptor.ExeContextInterceptor;
import com.kamijoucen.powerstruct.interceptor.ExeInvoker;

public class StructConfigurationImpl implements StructConfiguration {

    private ExeContextFactory exeContextFactory;

    private ExeExecutor executor;

    public void init() {
        this.exeContextFactory = new ExeContextFactory();
        this.initExecutor();
    }

    public void initExecutor() {
        this.executor = new DefaultExecutorImpl();
        this.executor.addExeInterceptor(new ExeContextInterceptor(this));
        this.executor.addExeInterceptor(new ExeInvoker());
    }

    @Override
    public ExeContextFactory getExeContextFactory() {
        return exeContextFactory;
    }

    public void setExeContextFactory(ExeContextFactory exeContextFactory) {
        this.exeContextFactory = exeContextFactory;
    }

    @Override
    public ExeExecutor getExecutor() {
        return executor;
    }

    public void setExecutor(ExeExecutor executor) {
        this.executor = executor;
    }
}
