package org.epoch.proxy.cglib;

/**
 * @auth: Marshal
 * @date: 2019/7/30
 * @desc:
 */
public class Client {
    public static void main(String[] args) {
        // 生成字节码文件
        // System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");

        // 生成 Cglib 代理类
        Subject subjectProxy = (Subject) ProxyFactory.getProxy(new Subject());
        // 调用相关方法
        subjectProxy.eat();
        subjectProxy.work();
    }
}
