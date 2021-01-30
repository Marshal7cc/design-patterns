package org.epoch.servant;

/**
 * <p>name:Servant</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/19
 */
public class Servant {
    public void service(IServiced iServiced) {
        iServiced.serviced();
    }
}
