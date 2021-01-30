package org.epoch.builder;

/**
 * <p>name:ConcreteBuilder</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/9
 */
public class ConcreteBuilder implements IBuilder {
    public Product build() {
        return new Product();
    }
}
