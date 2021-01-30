package org.epoch.mediator;

/**
 * <p>name:Mediator</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public class Mediator {
    protected ColleagueA colleagueA;
    protected ColleagueB colleagueB;

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    public void notifyA(String message) {
        colleagueA.receiveB(message);
    }

    public void notifyB(String message) {
        colleagueB.receiveA(message);
    }
}
