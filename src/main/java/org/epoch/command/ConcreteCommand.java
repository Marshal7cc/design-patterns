package org.epoch.command;


/**
 * <p>name:ConcreteCommand</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public class ConcreteCommand implements ICommand {
    private Receiver receiver = new Receiver();

    public void execute() {
        receiver.action();
    }
}
