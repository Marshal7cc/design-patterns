package org.epoch.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @auth: Marshal
 * @date: 2019/6/5
 * @desc:
 */
public class Proxy implements InvocationHandler {
    private Object target;

    public Proxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target, args);
    }
}
