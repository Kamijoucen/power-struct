package com.kamijoucen.powerstruct.context;

import java.util.Stack;

public class ContextUtil {

    protected static ThreadLocal<Stack<ExeContext>> contextThreadLocal = new ThreadLocal<>();

    public static ExeContext getStructContext() {
        Stack<ExeContext> stack = getStack(contextThreadLocal);
        if (stack.isEmpty()) {
            return null;
        }
        return stack.peek();
    }

    public static void setStructContext(ExeContext exeContext) {
        getStack(contextThreadLocal).push(exeContext);
    }

    public static void removeStructContext() {
        getStack(contextThreadLocal).pop();
    }

    protected static <T> Stack<T> getStack(ThreadLocal<Stack<T>> threadLocal) {
        Stack<T> stack = threadLocal.get();
        if (stack == null) {
            stack = new Stack<>();
            threadLocal.set(stack);
        }
        return stack;
    }

}
