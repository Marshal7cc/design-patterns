package org.epoch.composite;

/**
 * <p>name:Client</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/13
 */
public class Client {
    public static void main(String[] args) {
        Component root = new Composite("root");
        Component branchA = new Composite("branchA");
        Component branchB = new Composite("branchB");

        Component leafA = new Leaf("leafA");
        Component leafB = new Leaf("leafB");

        root.addChild(branchA);
        root.addChild(branchB);
        //...
    }
}
