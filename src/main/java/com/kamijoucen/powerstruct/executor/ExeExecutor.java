package com.kamijoucen.powerstruct.executor;

import com.kamijoucen.powerstruct.exe.Exe;
import com.kamijoucen.powerstruct.interceptor.ExeInterceptor;

public interface ExeExecutor {

    <R> R execute(Exe<R> exe);

    void addExeInterceptor(ExeInterceptor interceptor);

}
