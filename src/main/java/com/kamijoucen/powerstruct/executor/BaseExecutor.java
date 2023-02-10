package com.kamijoucen.powerstruct.executor;

import com.kamijoucen.powerstruct.interceptor.Exe;

public interface BaseExecutor {

    <R> R execute(Exe<R> exe);

    void addExeInterceptor();

}
