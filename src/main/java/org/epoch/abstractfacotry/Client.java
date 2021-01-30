package org.epoch.abstractfacotry;

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
        IProductA productAM = new ConcreteFactoryM().createA();
        IProductB productBM = new ConcreteFactoryM().createB();

        IProductA productAN = new ConcreteFactoryN().createA();
        IProductB productBN = new ConcreteFactoryN().createB();
    }
}
