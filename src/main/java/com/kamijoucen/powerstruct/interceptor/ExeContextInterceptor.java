package com.kamijoucen.powerstruct.interceptor;

import com.kamijoucen.powerstruct.context.ContextUtil;
import com.kamijoucen.powerstruct.context.ExeContext;
import com.kamijoucen.powerstruct.context.ExeContextFactory;

public class ExeContextInterceptor extends AbstractExeInterceptor {

    private final ExeContextFactory contextFactory;

    public ExeContextInterceptor(ExeContextFactory contextFactory) {
        this.contextFactory = contextFactory;
    }

    @Override
    public <R> R execute(Exe<R> exe) {
        ExeContext context = contextFactory.getExeContext(exe);
        try {
            ContextUtil.setStructContext(context);
            return exe.execute(context);
        } finally {
            ContextUtil.removeStructContext();
        }
    }
}
