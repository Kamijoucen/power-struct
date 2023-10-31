package com.kamijoucen.powerstruct.interceptor;

import com.kamijoucen.powerstruct.context.RuntimeContext;
import com.kamijoucen.powerstruct.exe.Exe;

public class TraceInterceptor extends AbstractExeInterceptor {

    @Override
    public <R> R execute(Exe<R> exe, RuntimeContext context) {

        context.pushTrace(exe.getName());
        try {
            return exe.execute(context);
        } finally {
            context.popTrace();
        }
    }

}
