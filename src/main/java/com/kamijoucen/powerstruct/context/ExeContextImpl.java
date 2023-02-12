package com.kamijoucen.powerstruct.context;

import com.kamijoucen.powerstruct.interceptor.Exe;

public class ExeContextImpl implements ExeContext {

    private final Exe<?> exe;

    public ExeContextImpl(Exe<?> exe) {
        this.exe = exe;
    }

    @Override
    public Exe<?> getExe() {
        return exe;
    }
}
