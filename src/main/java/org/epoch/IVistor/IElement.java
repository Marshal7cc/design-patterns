package org.epoch.IVistor;

/**
 * <p>name:IElement</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public interface IElement {
    void accept(IVisitor visitor);
}
