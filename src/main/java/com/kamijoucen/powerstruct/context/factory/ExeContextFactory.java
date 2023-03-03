package com.kamijoucen.powerstruct.context.factory;

import com.kamijoucen.powerstruct.context.ExeContext;
import com.kamijoucen.powerstruct.context.ExeContextImpl;
import com.kamijoucen.powerstruct.exe.Exe;

import java.util.Objects;

public class ExeContextFactory {

    public ExeContext getExeContext(Exe<?> exe, ExeContext parentContext) {
        ExeContextImpl context = new ExeContextImpl(exe, parentContext);
        if (Objects.nonNull(parentContext)) {
            context.setGlobalContext(parentContext.getGlobalContext());
        }
        return context;
    }
}
