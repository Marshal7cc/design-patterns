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
public class NonTerminalExpression implements IExpression {
    private IExpression[] expressions;

    public NonTerminalExpression(IExpression[] expressions) {
        this.expressions = expressions;
    }

    public Object intercept(Context context) {
        // 进行文法处理
        context.put("", "");
        return null;
    }
}
