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
public class ConcretePrototypeA implements IPrototype<ConcretePrototypeA> {
    private String desc;

    public ConcretePrototypeA(String desc) {
        this.desc = desc;
    }

    @Override
    public ConcretePrototypeA clone() {
        return new ConcretePrototypeA(this.desc);
    }
}
