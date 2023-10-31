package com.kamijoucen.powerstruct.config;

import com.kamijoucen.powerstruct.executor.DefaultExecutorImpl;
import com.kamijoucen.powerstruct.executor.ExeExecutor;
import com.kamijoucen.powerstruct.interceptor.ExeInvoker;
import com.kamijoucen.powerstruct.interceptor.TraceInterceptor;

public class StructConfigurationImpl implements StructConfiguration {

    private ExeExecutor executor;

    public void init() {
        this.initExecutor();
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
}
