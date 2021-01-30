package org.epoch.memento;

/**
 * <p>name:Client</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("init");

        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(originator.createMemento());

        originator.setState("state");
        careTaker.setMemento(originator.createMemento());

        originator.setState("state_end");
        originator.restore(careTaker.getMemento());
        System.out.println(originator.getState());
        originator.restore(careTaker.getMemento());
        System.out.println(originator.getState());
    }
}
