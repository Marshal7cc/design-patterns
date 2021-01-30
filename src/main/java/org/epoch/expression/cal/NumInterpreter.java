package org.epoch.expression.cal;

/**
 * 终结表达式
 */
public class NumInterpreter implements IArithmeticInterpreter {
    private int value;

    public NumInterpreter(int value) {
        this.value = value;
    }

    public int interpret() {
        return this.value;
    }
}
