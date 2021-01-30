package org.epoch.expression;

/**
 * <p>name:TerminalExpression</p>
 * <pre>
 *      description:
 * </pre>
 *
 * @author Marshal Yuan
 * @date 2021/1/17
 */
public class TerminalExpression implements IExpression {
    private Object value;

    public Object intercept(Context context) {
        // 实现文法中与终结符有关的操作
        context.put("", "");
        return null;
    }
}
