package com.kamijoucen.powerstruct.context;

import com.kamijoucen.powerstruct.executor.BaseExecutor;

public interface StructContext {

    <R> R execute();

    BaseExecutor getExecutor();

}
