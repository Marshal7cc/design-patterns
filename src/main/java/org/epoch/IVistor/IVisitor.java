package org.epoch.IVistor;

/**
 * <p>name:IVistor</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public interface IVisitor {
    void visit(ConcreteElementA a);

    void visit(ConcreteElementB b);
}
