package com.kamijoucen.powerstruct.interceptor;

public abstract class AbstractExeInterceptor implements ExeInterceptor {

    protected ExeInterceptor next;

    @Override
    public ExeInterceptor getNext() {
        return next;
    }

    @Override
    public void setNext(ExeInterceptor next) {
        this.next = next;
    }
}
