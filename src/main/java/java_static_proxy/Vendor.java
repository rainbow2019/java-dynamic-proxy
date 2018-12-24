package java_static_proxy;

/**
 * 这就是静态代理，利用组合(聚合)的设计模式，实现同一个接口，
 * 在代理类的具体实现中，调用委托类的相应方法。
 */
public class Vendor implements Seller {
    private Merchant merchant;

    public Vendor(Merchant merchant) {
        this.merchant = merchant;
    }

    @Override
    public void sell(){
        System.out.println("I'm Vendor.负责代理merchant卖东西......");
        merchant.sell();
    }
}
