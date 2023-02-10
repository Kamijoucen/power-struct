package com.kamijoucen.powerstruct.executor;

import com.kamijoucen.powerstruct.context.StructContext;

public interface BaseExecutor {

    <R> R execute(StructContext context);

}
