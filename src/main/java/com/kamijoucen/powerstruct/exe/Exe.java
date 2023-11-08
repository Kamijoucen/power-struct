package com.kamijoucen.powerstruct.exe;

import com.kamijoucen.powerstruct.context.RuntimeContext;

public interface Exe<R> {

    R execute(RuntimeContext context);

}
