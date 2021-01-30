package org.epoch.strategy;

/**
 * <p>name:Context</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/16
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void doSth() {
        strategy.doSth();
    }
}
