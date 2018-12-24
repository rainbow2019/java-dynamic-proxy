package jdk_dynamic_proxy.demo2;

public class BookFacadeImpl implements BookFacade {
    @Override
    public void addBook(String name){
        System.out.println("name = " + name);
    }

    @Override
    public void deleteBook(){
        System.out.println("deleteBook");
    }
}
