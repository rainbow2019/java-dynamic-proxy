package cglib_dynamic_proxy;

public class Singer {
    public void sing(String songName){
        System.out.println("songName = " + songName);
    }
    public final void singAndDance(){
        System.out.println("Sing and Dance");
    }
    public static void perform(){
        System.out.println("Perform");
    }
    private void sayHello(){//private 方法无法被代理
        System.out.println("say Hello");
    }
}
