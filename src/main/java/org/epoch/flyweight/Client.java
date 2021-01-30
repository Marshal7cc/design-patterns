package org.epoch.flyweight;

/**
 * <p>name:Client</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/12
 */
public class Client {
    public static void main(String[] args) {
        // 业务方1拿到并处理业务逻辑
        IFlyweight flyweight1 = FlyweightFactory.get("10001");
        // 业务方2拿到并处理业务逻辑
        IFlyweight flyweight2 = FlyweightFactory.get("10001");
    }
}
