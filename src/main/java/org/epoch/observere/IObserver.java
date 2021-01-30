package org.epoch.observere;

/**
 * <p>name:IObserver</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public interface IObserver<E> {
    void update(E event);
}
