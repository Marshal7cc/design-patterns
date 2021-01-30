package org.epoch.strategy;

/**
 * <p>name:Client</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/16
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new StrategyA());
        context.doSth();

        Context context1 = new Context(new StrategyB());
        context1.doSth();
    }
}
