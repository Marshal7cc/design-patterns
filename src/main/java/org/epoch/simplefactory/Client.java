package org.epoch.simplefactory;

/**
 * <p>name:Client</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/6
 */
public class Client {
    public static void main(String[] args) {
        IProduct productA = SimpleFactory.create("A");
        IProduct productB = SimpleFactory.create("B");
    }
}
