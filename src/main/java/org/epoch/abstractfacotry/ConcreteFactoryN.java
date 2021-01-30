package org.epoch.abstractfacotry;

/**
 * <p>name:ConcreteFactoryB</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/6
 */
public class ConcreteFactoryN implements IFactory {
    public IProductA createA() {
        return new ConcreteProductAN();
    }

    public IProductB createB() {
        return new ConcreteProductBN();
    }
}
