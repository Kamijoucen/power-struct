package com.kamijoucen.powerstruct.interceptor;

import com.kamijoucen.powerstruct.context.RuntimeContext;
import com.kamijoucen.powerstruct.exe.AbstractExe;
import com.kamijoucen.powerstruct.exe.Exe;

public class TraceInterceptor extends AbstractExeInterceptor {

    @Override
    public <R> R execute(Exe<R> exe, RuntimeContext context) {
        String exeName = null;
        if (exe instanceof AbstractExe) {
            exeName = ((AbstractExe<?>) exe).getName();
        } else {
            exeName = exe.getClass().getSimpleName();
        }
        context.pushTrace(exeName);
        try {
            return exe.execute(context);
        } finally {
            context.popTrace();
        }
    }

}
