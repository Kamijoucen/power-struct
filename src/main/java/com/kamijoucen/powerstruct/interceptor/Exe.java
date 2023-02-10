package com.kamijoucen.powerstruct.interceptor;


import com.kamijoucen.powerstruct.context.StructContext;

public interface Exe<R> {

    R execute(StructContext context);

}
