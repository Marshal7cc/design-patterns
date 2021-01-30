package org.epoch.memento;

import java.util.Stack;

/**
 * <p>name:CareTaker</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public class CareTaker {
    private Stack<Memento> mementos = new Stack<Memento>();

    public Memento getMemento() {
        return mementos.pop();
    }

    public void setMemento(Memento memento) {
        this.mementos.push(memento);
    }
}
