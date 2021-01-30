package org.epoch.prototype;

/**
 * <p>name:ConcretePrototypeA</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/9
 */
public class ConcretePrototypeB implements IPrototype<ConcretePrototypeB> {
    private String desc;

    public ConcretePrototypeB(String desc) {
        this.desc = desc;
    }

    @Override
    public ConcretePrototypeB clone() {
        return new ConcretePrototypeB(this.desc);
    }
}
