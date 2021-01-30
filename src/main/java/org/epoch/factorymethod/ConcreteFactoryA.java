package org.epoch.factorymethod;

/**
 * <p>name:ConcreteFactoryA</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/6
 */
public class ConcreteFactoryA implements IFactory {
    public IProduct create() {
        return new ConcreteProductA();
    }
}
