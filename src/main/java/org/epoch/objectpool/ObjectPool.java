package org.epoch.objectpool;

import java.util.Iterator;
import java.util.Vector;

/**
 * <p>name:ObjectPool</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/19
 */
public class ObjectPool {
    private int step = 10;
    private int minCount;
    private int maxCount;
    private Vector<IPooledObject> returneds;
    private Vector<IPooledObject> borroweds;

    public ObjectPool(int minCount, int maxCount) {
        borroweds = new Vector<IPooledObject>();
        returneds = new Vector<IPooledObject>();

        this.maxCount = maxCount;
        this.minCount = minCount;

        refresh(this.minCount);
    }

    public IPooledObject borrowObject() {
        IPooledObject next = null;
        if (returneds.size() > 0) {
            Iterator<IPooledObject> iterator = returneds.iterator();
            while (iterator.hasNext()) {
                next = iterator.next();
                returneds.remove(next);
                borroweds.add(next);
                return next;
            }
        } else {
            int count = maxCount - minCount;
            refresh(count > step ? step : count);
        }
        return next;
    }

    public void returnObject(IPooledObject object) {
        returneds.add(object);
        if (borroweds.contains(object)) {
            borroweds.remove(object);
        }
    }

    private void refresh(int count) {
        for (int i = 0; i < count; i++) {
            returneds.add(new ConcretePooledObject());
        }
    }
}
