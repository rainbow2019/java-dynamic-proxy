package cglib_dynamic_proxy;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

public class Test {
    /**
     * 对类进行动态代理
     */
    public static void main(String[] args) {
        //代理类class文件存入本地磁盘
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "./src/main/java/cglib_dynamic_proxy/cglib_classes");

        MyMethodInterceptor methodInterceptor = new MyMethodInterceptor();
        // 在MethodInterceptor 中封装了一个getInstance方法，用于获取代理对象
        Singer singerProxy = (Singer)methodInterceptor.getInstance(Singer.class);
        singerProxy.sing("生活不止眼前的苟且，还有诗和远方的田野");

/*        //将创建代理对象封装到getInstance方法中
        Singer singerProxy2 = (Singer)getInstance();
        singerProxy2.sing("生活不止眼前的苟且");
        System.out.println("----------------------------------------------");
        singerProxy2.singAndDance();//final方法无法被代理，但是不报错
        System.out.println("----------------------------------------------");

        System.out.println("----------------------------------------------");
        singerProxy2.perform();//static方法无法被代理，但是不报错
        System.out.println("----------------------------------------------");

//        singerProxy2.sayHello();//private方法无法被代理

        //Dancer实现了接口Star
        Star starProxy = (Star)methodInterceptor.getInstance(Dancer.class);
        starProxy.perform();*/
    }


    /**
     * 将生成对象封装成一个方法
     * @return
     */
    public static Object getInstance(){
        //S1：创建方法拦截器
        MyMethodInterceptor methodInterceptor = new MyMethodInterceptor();
        //S2: 创建增强器Enhancer
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(methodInterceptor);//设置方法拦截器
        enhancer.setSuperclass(Singer.class);//设置Super类
        //S3:生成代理对象
        Object singerProxy = enhancer.create();
        return singerProxy;
    }
}
