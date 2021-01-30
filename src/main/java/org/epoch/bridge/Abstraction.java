package org.epoch.bridge;

/**
 * <p>name:Abstraction</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/13
 */
public abstract class Abstraction {
    private IImplementor implementor;

    public Abstraction(IImplementor implementor) {
        this.implementor = implementor;
    }

    public void operate() {
        //...
        implementor.operate();
        //...
    }
}
