package org.epoch.state;

/**
 * <p>name:StateA</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public class StateA extends AbstractState {
    @Override
    public void handle() {
        // do sth
        System.out.println("a");
        this.context.setCurrentState(StateHolder.stateB);
    }
}
