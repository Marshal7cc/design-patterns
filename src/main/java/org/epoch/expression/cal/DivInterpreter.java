package org.epoch.expression.cal;

/**
 * 除法
 */
public class DivInterpreter extends Interpreter {
    public DivInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right);
    }

    public int interpret() {
        return this.left.interpret() / this.right.interpret();
    }
}
