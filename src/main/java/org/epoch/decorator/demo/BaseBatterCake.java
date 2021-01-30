package org.epoch.decorator.demo;

/**
 * <p>name:BaseBatterCake</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/11
 */
public class BaseBatterCake implements BatterCake {
    public String getMsg() {
        return "煎饼";
    }

    public int getPrice() {
        return 5;
    }
}
