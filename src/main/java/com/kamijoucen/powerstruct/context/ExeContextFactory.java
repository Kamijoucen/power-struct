package com.kamijoucen.powerstruct.context;

import com.kamijoucen.powerstruct.interceptor.Exe;

public class ExeContextFactory {

    public ExeContext getExeContext(Exe<?> exe) {
        return new ExeContextImpl(exe);
    }
}
