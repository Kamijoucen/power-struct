package com.kamijoucen.powerstruct.executor;

import com.kamijoucen.powerstruct.interceptor.Exe;
import com.kamijoucen.powerstruct.interceptor.ExeInterceptor;

import java.util.Objects;

public class DefaultExecutorImpl implements BaseExecutor {

    private ExeInterceptor first;

    @Override
    public <R> R execute(Exe<R> exe) {
        Objects.requireNonNull(exe);
        return first.execute(exe);
    }

    @Override
    public void addExeInterceptor(ExeInterceptor interceptor) {
        // todo
    }
}
