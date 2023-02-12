package com.kamijoucen.powerstruct.interceptor;


import com.kamijoucen.powerstruct.context.ExeContext;

public interface Exe<R> {

    R execute(ExeContext context);

}
