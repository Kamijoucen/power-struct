package com.kamijoucen.powerstruct.interceptor;

import com.kamijoucen.powerstruct.context.RuntimeContext;
import com.kamijoucen.powerstruct.exe.Exe;

public interface ExeInterceptor {

    <R> R execute(Exe<R> exe, RuntimeContext context);

    ExeInterceptor getNext();

    void setNext(ExeInterceptor next);
}