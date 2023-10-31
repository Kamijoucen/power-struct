package com.kamijoucen.powerstruct.executor;

import com.kamijoucen.powerstruct.context.RuntimeContext;
import com.kamijoucen.powerstruct.exe.Exe;
import com.kamijoucen.powerstruct.interceptor.ExeInterceptor;

import java.util.Objects;

public class DefaultExecutorImpl implements ExeExecutor {

    private ExeInterceptor first;

    @Override
    public <R> R execute(Exe<R> exe, RuntimeContext context) {
        Objects.requireNonNull(exe);
        Objects.requireNonNull(context);
        return first.execute(exe, context);
    }

    @Override
    public void addExeInterceptor(ExeInterceptor interceptor) {
        if (first == null) {
            first = interceptor;
            return;
        }
        ExeInterceptor last = first;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        last.setNext(interceptor);
    }
}
