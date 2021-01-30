package org.epoch.state;

/**
 * <p>name:StateHolder</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public class StateHolder {
    public static final Context context = new Context();
    public static final AbstractState stateA = new StateA();
    public static final AbstractState stateB = new StateB();

    static {
        context.setCurrentState(stateA);
        stateA.setContext(context);
        stateB.setContext(context);
    }
}
