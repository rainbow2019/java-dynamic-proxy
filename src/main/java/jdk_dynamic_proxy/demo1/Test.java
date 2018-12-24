package jdk_dynamic_proxy.demo1;

import sun.awt.datatransfer.DataTransferer;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class Test {
    /**
     * JDK动态代理
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws NoSuchMethodException,InstantiationException,IllegalAccessException, InvocationTargetException {
        //S1:创建一个InvocationHandler调用处理器
        InvocationHandler invocationHandler = new StudProxyInvocationHandler(new Student());
        //S2:获取代理类的Class对象
//       Class<?> clazz =  Proxy.getProxyClass(Person.class.getClassLoader(),new Class[]{Person.class});
       Class<?> clazz =  Proxy.getProxyClass(Person.class.getClassLoader(),Person.class);
       //S3:获取一个InvocationHandler为参数的构造器
       Constructor<?> constructor =  clazz.getConstructor(InvocationHandler.class);
       //S4:通过构造器，创建代理对象
       Person monitor = (Person)constructor.newInstance(invocationHandler);
       //操作代理对象
       monitor.submitWork();

       //生成代理对象
        createProxyClass();

       //创建第二个代理对象
       Person monitor2 = (Person)Proxy.newProxyInstance(Person.class.getClassLoader(),new Class[]{Person.class}, invocationHandler);
       monitor2.submitWork();

    }

    public static void createProxyClass(){
        //将代理类的class写到文件中
        //利用ProxyGenerator的静态方法generateProxyClasss生成代理对象的二进制数据
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",Student.class.getInterfaces());
        String path = "./src/main/java/jdk_dynamic_proxy/proxy_classes/StudentProxy.class";
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            OutputStream os = new FileOutputStream(file);
            os.write(bytes);
            os.flush();
            os.close();
            System.out.println("写文件成功");
        }catch (IOException e){
            System.out.println("写文件失败");
        }
    }

}
