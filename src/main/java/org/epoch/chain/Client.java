package org.epoch.chain;

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
        Handler handler = new HandlerA();
        handler.next(new HandlerB());

        handler.handleRequest("request");
    }
}
