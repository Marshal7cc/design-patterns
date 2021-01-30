package org.epoch.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>name:FlyweightFactory</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/12
 */
public class FlyweightFactory {
    static Map<String, IFlyweight> map = new HashMap<String, IFlyweight>();

    public static IFlyweight get(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        } else {
            IFlyweight flyweight = new ConcreteFlyweight(key);
            map.put(key, flyweight);
            return flyweight;
        }
    }
}
