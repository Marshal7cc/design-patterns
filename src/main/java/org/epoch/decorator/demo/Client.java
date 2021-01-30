package org.epoch.decorator.demo;

/**
 * <p>name:Client</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/11
 */
public class Client {
    public static void main(String[] args) {
        BatterCake batterCake = new BaseBatterCake();
        //一个煎饼+2个鸡蛋+1个火腿肠的扩展非常方便
        //如果不用装饰器，则需要单独写一个CakeWith2EggAnd1Sausage类,并且每出现一个组合就要新建一个类
        BatterCake batterCake1 = new EggDecorator(batterCake);
        BatterCake batterCake2 = new EggDecorator(batterCake1);
        BatterCake batterCake3 = new SausageDecorator(batterCake2);

        System.out.println(batterCake3.getMsg());
        System.out.println(batterCake3.getPrice());
    }
}
