package singleton.singleton4;

/**
 * 第四种（饿汉，变种）
 */
public class Singleton {

    private static Singleton instance = null;

    static {
        instance = new Singleton();
    }

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }

}