package org.epoch.IVistor;

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
        ObjectStructure collection = new ObjectStructure();

        IVisitor visitorA = new ConcreteVisitorA();
        collection.accept(visitorA);

        IVisitor visitorB = new ConcreteVisitorB();
        collection.accept(visitorB);
    }
}
