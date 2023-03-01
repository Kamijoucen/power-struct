package com.kamijoucen.powerstruct.interceptor;

import com.kamijoucen.powerstruct.exe.Exe;

public interface ExeInterceptor {

    <R> R execute(Exe<R> exe);

    ExeInterceptor getNext();

    void setNext(ExeInterceptor next);

}
