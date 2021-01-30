package org.epoch.observere;

/**
 * <p>name:ConcreteObserver</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public class ConcreteObserver<E> implements IObserver<E> {
    public void update(E event) {
        System.out.println("receive event");
    }
}
