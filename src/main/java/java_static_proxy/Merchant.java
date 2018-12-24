package java_static_proxy;

public class Merchant implements Seller {
    @Override
    public void sell(){
        System.out.println("I'm a merchant.");
    }
}
