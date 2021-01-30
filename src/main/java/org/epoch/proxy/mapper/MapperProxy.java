package org.epoch.proxy.mapper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @auth: Marshal
 * @date: 2019/6/5
 * @desc:
 */
public class MapperProxy implements InvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 不做method.invoke...
        // 走自己的逻辑
        System.out.println("do other thing");
        return null;
    }
}
