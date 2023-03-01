package com.kamijoucen.powerstruct.context;

public class StructConfigurationImpl implements StructConfiguration {

    private ExeContextFactory exeContextFactory;

    public void init() {
        this.exeContextFactory = new ExeContextFactory();
    }

    @Override
    public ExeContextFactory getExeContextFactory() {
        return exeContextFactory;
    }

    public void setExeContextFactory(ExeContextFactory exeContextFactory) {
        this.exeContextFactory = exeContextFactory;
    }
}
