package org.epoch.templatemethod;

/**
 * <p>name:AbstractClass</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/16
 */
public abstract class AbstractClass {
    public final void run() {
        step1();
        step2();
        step3();
    }

    abstract protected void step1();

    abstract protected void step2();

    abstract protected void step3();
}
