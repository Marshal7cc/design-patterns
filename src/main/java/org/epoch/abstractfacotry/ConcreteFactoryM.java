package org.epoch.abstractfacotry;

/**
 * <p>name:ConcreteFactoryA</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/6
 */
public class ConcreteFactoryM implements IFactory {
    public IProductA createA() {
        return new ConcreteProductAM();
    }

    public IProductB createB() {
        return new ConcreteProductBM();
    }
}
