package org.epoch.proxy.jdk;

import java.lang.reflect.InvocationHandler;

/**
 * <p>name:PersonProxyFactory</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/10
 */
public class ProxyFactory {

    public static Object bind(Object target, InvocationHandler invocationHandler) {
        return java.lang.reflect.Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), invocationHandler);
    }
}
