package org.epoch.composite;

/**
 * <p>name:Component</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/13
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract String operation();

    public boolean addChild(Component component) {
        throw new UnsupportedOperationException();
    }

    public boolean removeChild(Component component) {
        throw new UnsupportedOperationException();
    }

    public boolean getChild(int index) {
        throw new UnsupportedOperationException();
    }
}
