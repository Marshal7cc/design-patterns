package org.epoch.iterator;

/**
 * <p>name:IAgggregate</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public interface IAggregate<E> {
    boolean add(E ele);

    boolean remove(E ele);

    Iterator<E> iterator();
}
