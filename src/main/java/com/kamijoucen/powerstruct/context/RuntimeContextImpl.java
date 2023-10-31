package com.kamijoucen.powerstruct.context;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kamijoucen.powerstruct.config.StructConfiguration;
import com.kamijoucen.powerstruct.exe.Exe;

public class RuntimeContextImpl implements RuntimeContext {

    private final Map<Object, Object> content = new HashMap<>();

    private final ArrayDeque<String> trace = new ArrayDeque<>();

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

    @Override
    public List<String> getTrace() {
        return new ArrayList<>(this.trace);
    }

    @Override
    public String popTrace() {
        return this.trace.pop();
    }

    @Override
    public void pushTrace(String trace) {
        this.trace.push(trace);
    }

}
