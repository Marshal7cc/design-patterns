package org.epoch.objectpool;

/**
 * <p>name:Client</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/19
 */
public class Client {
    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool(10, 50);
        IPooledObject object = objectPool.borrowObject();
        object.operation();

        objectPool.returnObject(object);
    }
}
