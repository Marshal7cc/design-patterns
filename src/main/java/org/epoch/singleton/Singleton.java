package org.epoch.singleton;

/**
 * <p>name:Singleton</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/9
 */
public class Singleton {
    //必须是vl，否则第一次判断可能获取到因指令重排序而提前逸出的引用
    private static volatile Singleton singleton;

    private Singleton() {

    }

    //双重检查
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (singleton) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        //这里可能会因为指令重排序而先返回其引用
        return singleton;
    }
}
