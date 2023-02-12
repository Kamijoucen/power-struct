package com.kamijoucen.powerstruct.interceptor;

import com.kamijoucen.powerstruct.context.ContextUtil;
import com.kamijoucen.powerstruct.context.ExeContext;

import java.util.Objects;

public class ExeInvoker extends AbstractExeInterceptor {

    @Override
    public <R> R execute(Exe<R> exe) {
        ExeContext context = ContextUtil.getStructContext();
        Objects.requireNonNull(context);
        return exe.execute(context);
    }
}
