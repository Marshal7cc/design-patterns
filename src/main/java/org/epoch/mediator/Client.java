package org.epoch.mediator;

/**
 * <p>name:Client</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        ColleagueA a = new ColleagueA(mediator);
        ColleagueB b = new ColleagueB(mediator);

        mediator.setColleagueA(a);
        mediator.setColleagueB(b);

        a.sendB("send to B");
        b.sendA("send to A");
    }
}
