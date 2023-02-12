package com.kamijoucen.powerstruct.exe;

import com.kamijoucen.powerstruct.context.ExeContext;
import com.kamijoucen.powerstruct.interceptor.Exe;

public class DemoExe implements Exe<String> {

    private final String string;

    public DemoExe(String string) {
        this.string = string;
    }

    @Override
    public String execute(ExeContext context) {
        return null;
    }
}
