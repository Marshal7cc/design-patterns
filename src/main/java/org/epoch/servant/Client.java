package org.epoch.servant;

/**
 * <p>name:Client</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/19
 */
public class Client {
    public static void main(String[] args) {
        IServiced iServiced1 = new ConcreteService1();
        IServiced iServiced2 = new ConcreteService2();

        Servant servant = new Servant();
        servant.service(iServiced1);
        servant.service(iServiced2);
    }
}
