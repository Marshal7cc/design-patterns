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
public class ColleagueB extends Colleague {
    public ColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void sendA(String message) {
        System.out.println("mediator support");
        this.mediator.notifyA(message);
    }

    public void receiveA(String message) {
        // do sth
        System.out.println("received from A supported by mediator");
    }
}
