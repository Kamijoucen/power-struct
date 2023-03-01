package com.kamijoucen.powerstruct.exe;


import com.kamijoucen.powerstruct.context.ExeContext;

public interface Exe<R> {

    R execute();

    ExeContext getParentContext();

    ExeContext getContext();

    void setContext(ExeContext context);

}
