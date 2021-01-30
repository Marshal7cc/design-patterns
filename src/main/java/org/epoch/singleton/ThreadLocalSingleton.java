package org.epoch.singleton;

/**
 * <p>name:ThreadLocalSingleton</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/9
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> t = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance() {
        return t.get();
    }
}
