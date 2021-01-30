package org.epoch.mediator;

/**
 * <p>name:Colleague</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public class ColleagueA extends Colleague {
    public ColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void sendB(String message) {
        System.out.println("mediator support");
        this.mediator.notifyB(message);
    }

    public void receiveB(String message) {
        // do sth
        System.out.println("received from B supported by mediator");
    }
}
