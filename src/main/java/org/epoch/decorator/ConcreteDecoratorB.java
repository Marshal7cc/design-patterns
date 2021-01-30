package org.epoch.decorator;

/**
 * <p>name:ConcreteDecoratorA</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/11
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        before();
        super.operation();
        after();
    }

    private void before() {
    }

    private void after() {
    }
}
