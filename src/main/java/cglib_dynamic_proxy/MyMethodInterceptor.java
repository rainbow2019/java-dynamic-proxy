package cglib_dynamic_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {
    public MyMethodInterceptor() {    }
    @Override
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy methodProxy) throws Throwable {
        System.out.println("-----------Before--------------");
        Object result = methodProxy.invokeSuper(obj,args);
        System.out.println("-----------After--------------");
        return result;
    }

    /**
     * 将生成对象封装成一个方法
     * @return
     */
    public Object getInstance(Class target){
        Enhancer enhancer = new Enhancer();//创建增强器
        //设置回调：对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实现intercept()方法进行拦
        enhancer.setCallback(this);//设置方法拦截器
        //为加强器指定要代理的业务类（即：为下面生成的代理类指定父类）
        enhancer.setSuperclass(target);//设置Super类
        // 创建动态代理类对象并返回
        return enhancer.create();
    }
}
