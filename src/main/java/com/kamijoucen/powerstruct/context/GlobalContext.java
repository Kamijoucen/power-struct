package com.kamijoucen.powerstruct.context;

public interface GlobalContext {

    Object getProperty(Object key);

    void addProperty(Object key, Object value);

}
