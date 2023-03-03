package com.kamijoucen.powerstruct.exe;

import com.kamijoucen.powerstruct.context.ExeContext;

public class ChildDemoExe extends AbstractExe<String> {

    private final String string;

    public ChildDemoExe(String string, Exe<?> exe) {
        super(exe);
        this.string = string;
    }

    @Override
    public String execute() {
        return "child: " + string;
    }

}
