package org.epoch.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @auth: Marshal
 * @date: 2019/6/5
 * @desc: 指定的代理行为
 */
public class ProxyAction implements InvocationHandler {
    private Object target;

    public ProxyAction(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 这里的proxy还是一个增强对象
        // 所以 invoke(target, args) 而不能是invoke(proxy, args)而不能是
        System.out.println("do sth before invoke");
        return method.invoke(target, args);
    }
}
