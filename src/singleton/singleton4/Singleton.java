package singleton.singleton4;

/**
 * 第四种（饿汉，变种）
 * <p>
 * 表面上看起来差别挺大，其实更第三种方式差不多，都是在类初始化即实例化instance。
 */
public class Singleton {

    private static final Singleton INSTANCE;

    static {
        INSTANCE = new Singleton();
    }

    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }

}