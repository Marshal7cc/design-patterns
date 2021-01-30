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
public class SausageDecorator implements BatterCake {
    private BatterCake batterCake;

    public SausageDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    public String getMsg() {
        return batterCake.getMsg() + "+1个火腿肠";
    }

    public int getPrice() {
        return batterCake.getPrice() + 3;
    }
}
