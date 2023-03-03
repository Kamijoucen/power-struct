package com.kamijoucen.powerstruct.context;

import com.kamijoucen.powerstruct.exe.Exe;

public class ExeContextImpl implements ExeContext {

    private final Exe<?> exe;

    private final ExeContext parentContext;

    private GlobalContext globalContext;

    public ExeContextImpl(Exe<?> exe, ExeContext context) {
        this.exe = exe;
        this.parentContext = context;
    }

    @Override
    public ExeContext getParentContext() {
        return parentContext;
    }

    @Override
    public Exe<?> getExe() {
        return exe;
    }

    @Override
    public GlobalContext getGlobalContext() {
        return globalContext;
    }

    @Override
    public StructConfiguration getConfiguration() {
        return null;
    }

    public void setGlobalContext(GlobalContext globalContext) {
        this.globalContext = globalContext;
    }
}
