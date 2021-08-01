package org.epoch.proxy.jdk;

/**
 * @auth: Marshal
 * @date: 2019/6/5
 * @desc:
 */
public class Client {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        // Only Build an invocationHandler
        ProxyAction proxyAction = new ProxyAction(realSubject);
        // Get Real Proxy Object
        ISubject proxyObject = (ISubject) ProxyFactory.bind(realSubject, proxyAction);
        proxyObject.request();
    }
}
