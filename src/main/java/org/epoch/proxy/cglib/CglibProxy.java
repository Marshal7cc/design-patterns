package org.epoch.proxy.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * @auth: Marshal
 * @date: 2019/7/30
 * @desc:
 */
public class CglibProxy implements MethodInterceptor {

    private Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("###   before invocation");
        // methodProxy.invokeSuper(o, objects)为FastClass机制调用
        Object result = methodProxy.invokeSuper(o, objects);
        // 注释部分是反射调用
        // Object result = method.invoke(target, objects);
        System.out.println("###   end invocation");
        return result;
    }

}
