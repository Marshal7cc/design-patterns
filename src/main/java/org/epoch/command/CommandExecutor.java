package org.epoch.command;

/**
 * <p>name:CommandExecutor</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public class CommandExecutor {
    private ICommand command;

    public CommandExecutor(ICommand command) {
        this.command = command;
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
