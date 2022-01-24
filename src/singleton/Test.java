package singleton;

public class Test {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(1);
                }catch (InterruptedException e){

                }

                System.out.println("HashCode of Lazy:" + LazyCache.getInstance().hashCode());
                System.out.println("HashCode of Eager:" + EagerCache.getInstance().hashCode());
                System.out.println("HashCode of Enum:" + CacheSingleton.INSTANCE.hashCode());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("HashCode of Lazy1:" + LazyCache.getInstance().hashCode());
                System.out.println("HashCode of Eager1:" + EagerCache.getInstance().hashCode());
                System.out.println("HashCode of Enum1:" + CacheSingleton.INSTANCE.hashCode());
            }
        }).start();


    }
}
