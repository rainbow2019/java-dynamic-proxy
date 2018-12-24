package jdk_dynamic_proxy.demo2;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
       BookFacade bookFacade =
               (BookFacade)Proxy.newProxyInstance(BookFacade.class.getClassLoader(),
                       new Class[]{ BookFacade.class },new BookInvokeHandler( new BookFacadeImpl()));
        System.out.println("bookFacade = " + bookFacade);
       bookFacade.addBook("aaaa");
    }
}
