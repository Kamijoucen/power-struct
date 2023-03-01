package com.kamijoucen.powerstruct.context;

import com.kamijoucen.powerstruct.context.factory.ExeContextFactory;
import com.kamijoucen.powerstruct.executor.ExeExecutor;

public interface StructConfiguration {

    ExeExecutor getExecutor();

    ExeContextFactory getExeContextFactory();

}
