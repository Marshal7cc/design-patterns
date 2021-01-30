package org.epoch.observere;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>name:ConcreteSubject</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public class ConcreteSubject<E> implements ISubject<E> {
    private List<IObserver<E>> observers = new ArrayList<IObserver<E>>();

    public boolean addOb(IObserver ob) {
        return this.observers.add(ob);
    }

    public boolean removeOb(IObserver ob) {
        return observers.remove(ob);
    }

    public void notify(E event) {
        for (IObserver<E> ob : observers) {
            ob.update(event);
        }
    }
}
