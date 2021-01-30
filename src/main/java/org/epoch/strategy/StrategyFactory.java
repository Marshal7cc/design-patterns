package org.epoch.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>name:StrategyFactory</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/16
 */
public class StrategyFactory {
    private static Map<String, IStrategy> strategys = new HashMap<String, IStrategy>();

    public static IStrategy get(String key) {
        //...
        return strategys.get(key);
    }
}
