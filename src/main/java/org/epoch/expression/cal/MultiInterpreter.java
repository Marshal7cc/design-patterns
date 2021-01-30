package org.epoch.expression.cal;

/**
 * 乘法
 */
public class MultiInterpreter extends Interpreter {
    public MultiInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    public int interpret() {
        return this.left.interpret() * this.right.interpret();
    }
}
