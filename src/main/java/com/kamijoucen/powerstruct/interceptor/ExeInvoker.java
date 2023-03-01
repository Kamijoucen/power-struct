package com.kamijoucen.powerstruct.interceptor;

import com.kamijoucen.powerstruct.exe.Exe;

public class ExeInvoker extends AbstractExeInterceptor {

    @Override
    public <R> R execute(Exe<R> exe) {
        return exe.execute();
    }
}
