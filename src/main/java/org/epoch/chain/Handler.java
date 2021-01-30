package org.epoch.chain;

/**
 * <p>name:Handler</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/16
 */
public abstract class Handler<T> {
    private Handler<T> next;

    public Handler next(Handler handler) {
        this.next = handler;
        return this;
    }

    public void handleRequest(T t) {

    }
}
