package org.epoch.delegate;

/**
 * <p>name:Delegate</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/14
 */
public class Delegate implements Task {
    public void run() {
        // 由delegate来对任务进行分发
        if (true) {
            Task task = new ConcreteTaskA();
            task.run();
        } else {
            Task task = new ConcreteTaskB();
            task.run();
        }
    }
}
