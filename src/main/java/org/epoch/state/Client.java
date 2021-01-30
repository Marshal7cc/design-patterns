package org.epoch.state;

/**
 * <p>name:Client</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public class Client {
    public static void main(String[] args) {
        AbstractState stateA = StateHolder.stateA;
        AbstractState stateB = StateHolder.stateB;

        Context context = StateHolder.context;
        context.handle();
        context.handle();
    }
}
