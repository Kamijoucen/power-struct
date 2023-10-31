package com.kamijoucen.powerstruct.context;

import com.kamijoucen.powerstruct.config.StructConfiguration;
import com.kamijoucen.powerstruct.exe.Exe;

public interface RuntimeContext {

    StructConfiguration getConfiguration();

    Object getProperty(Object key);

    void addProperty(Object key, Object value);

    <R> R execute(Exe<R> exe);

}
