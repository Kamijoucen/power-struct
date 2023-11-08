package com.kamijoucen.powerstruct;

import com.kamijoucen.powerstruct.api.ExecutionService;
import com.kamijoucen.powerstruct.api.impl.ExecutionServiceImpl;
import com.kamijoucen.powerstruct.config.StructConfigurationImpl;
import com.kamijoucen.powerstruct.context.RuntimeContext;
import com.kamijoucen.powerstruct.context.RuntimeContextImpl;
import com.kamijoucen.powerstruct.exe.ChildDemoExe;
import com.kamijoucen.powerstruct.exe.DemoExe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BaseTest {

    private StructConfigurationImpl configuration;

    private ExecutionService executionService;


    @BeforeEach
    public void initConfig() {
        configuration = new StructConfigurationImpl();
        executionService = new ExecutionServiceImpl(configuration);
    }

    @Test
    public void test1() {
        
        RuntimeContext context = new RuntimeContextImpl(configuration);
        
        DemoExe exe = new DemoExe();
        String r = configuration.getExecutor().execute(exe, context);
        System.out.println(r);
    }

    // 返回值测试
    @Test
    public void test2() {
        String r = executionService.execute(new ChildDemoExe("lisicen"));
        Assertions.assertEquals("child: lisicen", r);
    }

    
    
}
