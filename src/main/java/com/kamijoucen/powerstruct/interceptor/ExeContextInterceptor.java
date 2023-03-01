package com.kamijoucen.powerstruct.interceptor;

import com.kamijoucen.powerstruct.context.ExeContext;
import com.kamijoucen.powerstruct.context.ExeContextFactory;
import com.kamijoucen.powerstruct.context.StructConfiguration;
import com.kamijoucen.powerstruct.exe.Exe;

import java.util.Objects;

public class ExeContextInterceptor extends AbstractExeInterceptor {

    private final StructConfiguration configuration;

    public ExeContextInterceptor(StructConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public <R> R execute(Exe<R> exe) {
        ExeContext context = configuration.getExeContextFactory().getExeContext(exe, exe.getParentContext());
        exe.setContext(context);
        return exe.execute();
    }
}
