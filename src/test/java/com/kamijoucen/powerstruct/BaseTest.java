package com.kamijoucen.powerstruct;

import com.kamijoucen.powerstruct.context.StructConfigurationImpl;
import com.kamijoucen.powerstruct.exe.DemoExe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BaseTest {

    private StructConfigurationImpl configuration;


    @BeforeEach
    public void initConfig() {
        configuration = new StructConfigurationImpl();
        configuration.init();
    }

    @Test
    public void test1() {
        DemoExe exe = new DemoExe("test1");
        String r = configuration.getExecutor().execute(exe);
        System.out.println(exe.getContext());
        System.out.println(r);
    }

}
