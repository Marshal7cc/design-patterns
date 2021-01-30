package org.epoch.iterator;

import java.util.List;

/**
 * <p>name:ListIterator</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public class ListIterator<E> implements Iterator<E> {
    private List<E> list;
    private int cursor = 0;

    public ListIterator(List<E> list) {
        this.list = list;
    }

    public E next() {
        return this.list.get(cursor++);
    }

    public boolean hasNext() {
        return this.cursor < this.list.size();
    }
}
