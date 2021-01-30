package org.epoch.bridge;

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
        // 创建一个具体角色
        IImplementor implementor = new ConcreteImplementorA();
        // 聚合实现
        Abstraction abs = new RefinedAbstraction(implementor);
        abs.operate();
    }
}
