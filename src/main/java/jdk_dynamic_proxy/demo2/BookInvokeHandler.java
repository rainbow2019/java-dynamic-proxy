package jdk_dynamic_proxy.demo2;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 调用处理器
 */
public class BookInvokeHandler implements InvocationHandler {
    private Object obj;

    public BookInvokeHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable{
        System.out.println("开始动态代理");
        Object result = method.invoke(obj,args);
        System.out.println("结束代理");
        return result;
    }

}
