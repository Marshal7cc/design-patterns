package org.epoch.facade;

/**
 * <p>name:Client</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/11
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.runA();
        facade.runB();
        facade.runC();
    }
}
