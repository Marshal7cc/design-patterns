package org.epoch.proxy;

/**
 * <p>name:Proxy</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/10
 */
public class Proxy implements ISubject {
    private ISubject subject;

    public Proxy(ISubject subject) {
        this.subject = subject;
    }

    public void request() {
        before();
        subject.request();
        after();
    }

    public void before() {
    }

    public void after() {
    }
}
