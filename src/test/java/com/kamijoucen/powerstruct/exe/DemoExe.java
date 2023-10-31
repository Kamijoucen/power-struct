package com.kamijoucen.powerstruct.exe;

import com.kamijoucen.powerstruct.context.RuntimeContext;

public class DemoExe extends AbstractExe<String> {

    @Override
    public String execute(RuntimeContext context) {
        return "hello world\t" + context.execute(new ChildDemoExe("child"));
    }

}
