package org.epoch.proxy.jdk;

/**
 * @auth: Marshal
 * @date: 2019/6/5
 * @desc:
 */
public class Client {
    public static void main(String[] args) {

        RealSubject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        ISubject subject = (ISubject) ProxyFactory.bind(realSubject, proxy);
        subject.request();
    }
}
