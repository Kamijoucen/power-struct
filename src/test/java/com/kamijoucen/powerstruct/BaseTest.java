package com.kamijoucen.powerstruct;


import com.kamijoucen.powerstruct.context.StructConfiguration;
import com.kamijoucen.powerstruct.context.StructConfigurationImpl;
import com.kamijoucen.powerstruct.exe.DemoExe;
import com.kamijoucen.powerstruct.executor.BaseExecutor;
import com.kamijoucen.powerstruct.executor.DefaultExecutorImpl;
import com.kamijoucen.powerstruct.interceptor.ExeContextInterceptor;
import com.kamijoucen.powerstruct.interceptor.ExeInvoker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BaseTest {

    private StructConfiguration configuration;

    private BaseExecutor baseExecutor;

    @BeforeEach
    public void initConfig() {
        configuration = new StructConfigurationImpl();
    }

    @BeforeEach
    public void initExecutor() {
        baseExecutor = new DefaultExecutorImpl();
        baseExecutor.addExeInterceptor(new ExeContextInterceptor(configuration.getExeContextFactory()));
        baseExecutor.addExeInterceptor(new ExeInvoker());
    }

    @Test
    public void test1() {
        DemoExe exe = new DemoExe("test1");
        String r = baseExecutor.execute(exe);
        System.out.println(r);
    }

}
