package org.epoch.decorator.demo;

/**
 * <p>name:EggDecorator</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/11
 */
public class EggDecorator implements BatterCake {
    private BatterCake batterCake;

    public EggDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    public String getMsg() {
        return batterCake.getMsg() + "+1个鸡蛋";
    }

    public int getPrice() {
        return batterCake.getPrice() + 2;
    }
}
