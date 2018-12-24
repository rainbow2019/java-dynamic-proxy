package jdk_dynamic_proxy.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StudProxyInvocationHandler implements InvocationHandler {

    //组合委托类
    private Student stud;

    public StudProxyInvocationHandler(Student stud) {
        this.stud = stud;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable{
        System.out.println("代理Student开始.....");
        Object res = method.invoke(stud,args);
        System.out.println("代理Student结束.....");
        return res;
    }
}
