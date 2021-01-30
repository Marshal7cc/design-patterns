package org.epoch.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>name:ListAggregate</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public class ListAggregate<E> implements IAggregate<E> {
    private List<E> list = new ArrayList<E>();

    public boolean add(E ele) {
        return list.add(ele);
    }

    public boolean remove(E ele) {
        return list.remove(ele);
    }

    public Iterator<E> iterator() {
        return new ListIterator<E>(this.list);
    }
}
