package com.kamijoucen.powerstruct.context;

import com.kamijoucen.powerstruct.exe.Exe;

public class ExeContextFactory {

    public ExeContext getExeContext(Exe<?> exe, ExeContext parentContext) {
        return new ExeContextImpl(exe, parentContext);
    }
}
