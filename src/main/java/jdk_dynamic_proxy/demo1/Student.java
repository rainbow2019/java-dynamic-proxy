package jdk_dynamic_proxy.demo1;

import java.lang.reflect.InvocationHandler;

public class Student implements Person {

    InvocationHandler invocationHandler;

    public Student(InvocationHandler invocationHandler) {
        this.invocationHandler = invocationHandler;
    }

    public Student() {
    }

    @Override
    public void submitWork(){
        System.out.println("Student A submitWork!");
    }
}
