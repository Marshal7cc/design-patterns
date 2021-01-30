package org.epoch.adapter;

/**
 * <p>name:Adapter</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/13
 */
public class Adapter implements ITarget {
    private Adaptee adaptee;

    public String request() {
        String s = adaptee.specificRequest();
        // do sth with s
        return s;
    }
}
