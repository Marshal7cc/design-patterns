package org.epoch.facade;

/**
 * <p>name:Facade</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/11
 */
public class Facade {
    private SubSystemA a = new SubSystemA();
    private SubSystemB b = new SubSystemB();
    private SubSystemC c = new SubSystemC();

    public void runA() {
        a.run();
    }

    public void runB() {
        b.run();
    }

    public void runC() {
        c.run();
    }
}
