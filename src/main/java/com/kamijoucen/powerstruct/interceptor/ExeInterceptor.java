package com.kamijoucen.powerstruct.interceptor;

public interface ExeInterceptor {

    <R> R execute(Exe<R> exe);

    ExeInterceptor getNext();

    void setNext(ExeInterceptor next);

}
