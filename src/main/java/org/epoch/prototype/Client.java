package org.epoch.prototype;

/**
 * <p>name:Client</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/9
 */
public class Client {
    public static void main(String[] args) {
        ConcretePrototypeA a = new ConcretePrototypeA("a");
        ConcretePrototypeB b = new ConcretePrototypeB("b");

        ConcretePrototypeA cloneA = a.clone();
        ConcretePrototypeB cloneB = b.clone();
    }
}
