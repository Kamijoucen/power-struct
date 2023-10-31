package com.kamijoucen.powerstruct.exe;

import com.kamijoucen.powerstruct.context.RuntimeContext;

public class ChildDemoExe extends AbstractExe<String> {

    private final String string;

    public ChildDemoExe(String string) {
        this.string = string;
    }

    @Override
    public String execute(RuntimeContext context) {
        return "child: " + string;
    }

}
