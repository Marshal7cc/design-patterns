package org.epoch.state;

/**
 * <p>name:Context</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public class Context {
    private AbstractState currentState;

    public void handle() {
        currentState.handle();
    }

    public void setCurrentState(AbstractState state) {
        this.currentState = state;
        state.context = this;
    }
}
