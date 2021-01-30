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
public class RefinedAbstraction extends Abstraction {
    private IImplementor implementor;

    public RefinedAbstraction(IImplementor implementor) {
        super(implementor);
    }

    @Override
    public void operate() {
        //...
        super.operate();
        //...
    }
}
