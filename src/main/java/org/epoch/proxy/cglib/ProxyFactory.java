package org.epoch.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @author Marshal
 * @date 2021/1/30
 */
public class ProxyFactory {
    public static Object getProxy(Object target) {
        Enhancer enhancer = new Enhancer();
        // 设置需要代理的对象
        enhancer.setSuperclass(target.getClass());
        // 设置代理人
        enhancer.setCallback(new CglibProxy(target));
        return enhancer.create();
    }
}
