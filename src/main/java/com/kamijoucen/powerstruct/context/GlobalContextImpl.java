package com.kamijoucen.powerstruct.context;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GlobalContextImpl implements GlobalContext {

    private final Map<Object, Object> content = new ConcurrentHashMap<>();

    @Override
    public Object getProperty(Object key) {
        return content.get(key);
    }

    @Override
    public void addProperty(Object key, Object value) {
        content.put(key, value);
    }

}
