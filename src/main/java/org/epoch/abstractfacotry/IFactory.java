package org.epoch.abstractfacotry;

/**
 * <p>name:IFactory</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/6
 */
public interface IFactory {
    IProductA createA();

    IProductB createB();
}
