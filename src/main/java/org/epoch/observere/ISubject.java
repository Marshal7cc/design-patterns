package org.epoch.observere;

/**
 * <p>name:ISubject</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public interface ISubject<E> {
    boolean addOb(IObserver<E> ob);

    boolean removeOb(IObserver<E> ob);

    void notify(E event);
}
