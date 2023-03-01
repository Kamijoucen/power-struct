package com.kamijoucen.powerstruct.context;

import com.kamijoucen.powerstruct.exe.Exe;

public interface ExeContext {

    ExeContext getParentContext();

    Exe<?> getExe();

}
