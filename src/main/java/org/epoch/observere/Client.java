package org.epoch.observere;

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
        ISubject<String> subject = new ConcreteSubject<String>();

        IObserver<String> ob1 = new ConcreteObserver<String>();
        IObserver<String> ob2 = new ConcreteObserver<String>();

        subject.addOb(ob1);
        subject.addOb(ob2);

        subject.notify("update");
    }
}
