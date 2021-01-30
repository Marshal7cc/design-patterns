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
public class StateB extends AbstractState {
    @Override
    public void handle() {
        // do sth
        System.out.println("b");
        this.context.setCurrentState(StateHolder.stateA);
    }
}
