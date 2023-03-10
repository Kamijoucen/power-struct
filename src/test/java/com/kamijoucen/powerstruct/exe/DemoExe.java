package com.kamijoucen.powerstruct.exe;

import com.kamijoucen.powerstruct.context.ExeContext;

public class DemoExe extends AbstractExe<String> {

    private final String string;

    public DemoExe(String string) {
        super((ExeContext) null);
        this.string = string;
    }

    @Override
    public String execute() {
        return "hello world\t" + getExecutor().execute(new ChildDemoExe("newnew", this));
    }
}
