package org.epoch.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>name:Composite</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/13
 */
public class Composite extends Component {
    private List<Component> components;

    public Composite(String name) {
        super(name);
        this.components = new ArrayList<Component>();
    }

    @Override
    public String operation() {
        return null;
    }

    @Override
    public boolean addChild(Component component) {
        return super.addChild(component);
    }

    @Override
    public boolean removeChild(Component component) {
        return super.removeChild(component);
    }

    @Override
    public boolean getChild(int index) {
        return super.getChild(index);
    }
}
