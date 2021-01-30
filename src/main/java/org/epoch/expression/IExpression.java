package org.epoch.expression;

/**
 * <p>name:IExpression</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public interface IExpression {
    Object intercept(Context context);
}
