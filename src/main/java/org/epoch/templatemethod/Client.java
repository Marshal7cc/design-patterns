package org.epoch.templatemethod;

/**
 * <p>name:Client</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/16
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass templateA = new ConcreteClassA();
        templateA.run();
        AbstractClass templateB = new ConcreteClassB();
        templateB.run();
    }
}
