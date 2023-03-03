package com.kamijoucen.powerstruct.exe;


import com.kamijoucen.powerstruct.context.ExeContext;
import com.kamijoucen.powerstruct.context.StructConfiguration;

public interface Exe<R> {

    R execute();

    ExeContext getParentContext();

    ExeContext getContext();

    void setContext(ExeContext context);

    StructConfiguration getConfiguration();

    void setConfiguration(StructConfiguration configuration);

}
