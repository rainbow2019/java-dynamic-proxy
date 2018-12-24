package java_static_proxy;

public class Test {
    public static void main(String[] args) {
        Vendor vendor = new Vendor(new Merchant());
        vendor.sell();
    }
}
