package com.kamijoucen.powerstruct.interceptor;

import com.kamijoucen.powerstruct.context.RuntimeContext;
import com.kamijoucen.powerstruct.exe.Exe;

public class ExeInvoker extends AbstractExeInterceptor {

    @Override
    public <R> R execute(Exe<R> exe, RuntimeContext context) {
        return exe.execute(context);
    }
}
