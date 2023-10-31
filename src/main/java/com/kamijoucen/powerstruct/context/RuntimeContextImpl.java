package com.kamijoucen.powerstruct.context;

import java.util.HashMap;
import java.util.Map;

import com.kamijoucen.powerstruct.config.StructConfiguration;
import com.kamijoucen.powerstruct.exe.Exe;

public class RuntimeContextImpl implements RuntimeContext {

    private final Map<Object, Object> content = new HashMap<>();

    private final StructConfiguration configuration;
    
    public RuntimeContextImpl(StructConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public Object getProperty(Object key) {
        return content.get(key);
    }

    @Override
    public void addProperty(Object key, Object value) {
        content.put(key, value);
    }

    @Override
    public StructConfiguration getConfiguration() {
        return this.configuration;
    }

    @Override
    public <R> R execute(Exe<R> exe) {
        return this.configuration.getExecutor().execute(exe, this);
    }

}
