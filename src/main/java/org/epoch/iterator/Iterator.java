package org.epoch.iterator;

/**
 * <p>name:Iterator</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public interface Iterator<E> {
    E next();

    boolean hasNext();
}
