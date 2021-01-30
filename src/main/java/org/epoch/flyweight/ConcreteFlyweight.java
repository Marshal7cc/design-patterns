package org.epoch.flyweight;

/**
 * <p>name:ConcreteFlyweight</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/12
 */
public class ConcreteFlyweight implements IFlyweight {
    // 内部状态，基本不会变的状态
    private String key;
    // 外部状态，经常变
    private String name;


    public ConcreteFlyweight(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
