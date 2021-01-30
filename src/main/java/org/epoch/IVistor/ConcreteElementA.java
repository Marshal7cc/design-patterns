package org.epoch.IVistor;

/**
 * <p>name:ConcreteElementA</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public class ConcreteElementA implements IElement {
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
