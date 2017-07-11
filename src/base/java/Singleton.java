package base.java;


public class Singleton {

    public static int foo = 5;

    private Singleton() {
        System.out.println("java Singleton ");
    }

    private static final Singleton INSTANCE = new Singleton();

    public static Singleton getInstance() {
        return INSTANCE;
    }
}

class LazySingleton {
    public static int foo = 5;

    private LazySingleton() {
        System.out.println("java LazySingleton ");
    }

    private static class Holder {
        private static final LazySingleton LAZY_SINGLETON = new LazySingleton();
    }

    public static LazySingleton getInstance() {
        return Holder.LAZY_SINGLETON;
    }
}
