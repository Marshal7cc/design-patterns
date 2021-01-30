package org.epoch.factorymethod;

/**
 * <p>name:ConcreteFactoryB</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/6
 */
public class ConcreteFactoryB implements IFactory {
    public IProduct create() {
        return new ConcreteProductB();
    }
}
