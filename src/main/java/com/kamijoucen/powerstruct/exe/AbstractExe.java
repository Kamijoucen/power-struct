package com.kamijoucen.powerstruct.exe;

public abstract class AbstractExe<R> implements Exe<R> {

    private final String name;

    public AbstractExe(String name) {
        this.name = name;
    }

    public AbstractExe() {
        this.name = this.getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

}
