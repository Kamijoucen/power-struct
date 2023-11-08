package com.kamijoucen.powerstruct.api;

import com.kamijoucen.powerstruct.exe.Exe;

public interface ExecutionService {

    <R> R execute(Exe<R> execution);

}
