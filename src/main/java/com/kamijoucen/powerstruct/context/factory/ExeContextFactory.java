package com.kamijoucen.powerstruct.context.factory;

import com.kamijoucen.powerstruct.context.ExeContext;
import com.kamijoucen.powerstruct.context.ExeContextImpl;
import com.kamijoucen.powerstruct.exe.Exe;

public class ExeContextFactory {

    public ExeContext getExeContext(Exe<?> exe, ExeContext parentContext) {
        ExeContextImpl context = new ExeContextImpl(exe, parentContext);
        return context;
    }
}
