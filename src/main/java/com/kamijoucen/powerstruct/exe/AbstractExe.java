package com.kamijoucen.powerstruct.exe;

import com.kamijoucen.powerstruct.context.ExeContext;

public abstract class AbstractExe<R> implements Exe<R> {

    protected ExeContext parentContext;

    protected ExeContext context;


    public AbstractExe(ExeContext parrentContext) {
        this.parentContext = parrentContext;
    }

    @Override
    public ExeContext getParentContext() {
        return parentContext;
    }

    @Override
    public ExeContext getContext() {
        return context;
    }

    @Override
    public void setContext(ExeContext context) {
        this.context = context;
    }
}
