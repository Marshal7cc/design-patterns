package org.epoch.expression;

import java.util.Stack;

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
        Context context = new Context();
        // 语法容器,存储表达式
        Stack<IExpression> stack = new Stack<IExpression>();

        IExpression expression = stack.pop();
        expression.intercept(context);
    }
}
