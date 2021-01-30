package org.epoch.command;

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
        ConcreteCommand cmd = new ConcreteCommand();
        CommandExecutor commandExecutor = new CommandExecutor(cmd);
        commandExecutor.execute();
    }
}
