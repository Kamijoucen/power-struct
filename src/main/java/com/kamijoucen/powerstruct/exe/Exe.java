package com.kamijoucen.powerstruct.exe;

import com.kamijoucen.powerstruct.context.RuntimeContext;

public interface Exe<R> {

    String getName();

    R execute(RuntimeContext context);

}
