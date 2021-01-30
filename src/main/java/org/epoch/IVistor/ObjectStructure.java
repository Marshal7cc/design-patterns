package org.epoch.IVistor;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>name:ObjectStructure</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public class ObjectStructure {
    private List<IElement> list = new ArrayList<IElement>();

    {
        this.list.add(new ConcreteElementA());
        this.list.add(new ConcreteElementB());
    }

    public void accept(IVisitor visitor) {
        for (IElement element : list) {
            element.accept(visitor);
        }
    }
}
