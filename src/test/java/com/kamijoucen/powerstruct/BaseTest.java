package com.kamijoucen.powerstruct;

import com.kamijoucen.powerstruct.config.StructConfigurationImpl;
import com.kamijoucen.powerstruct.context.RuntimeContext;
import com.kamijoucen.powerstruct.context.RuntimeContextImpl;
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
        
        RuntimeContext context = new RuntimeContextImpl(configuration);
        
        DemoExe exe = new DemoExe();
        String r = configuration.getExecutor().execute(exe, context);
        System.out.println(r);
    }

    
    
}
