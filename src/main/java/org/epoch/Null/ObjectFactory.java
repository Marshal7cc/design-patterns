package org.epoch.Null;

/**
 * <p>name:ObjectFacotory</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/19
 */
public class ObjectFactory {
    public static AbstractObject getInstance() {
        if (true) {
            return new RealObject();
        } else {
            return new NullObject();
        }
    }
}
