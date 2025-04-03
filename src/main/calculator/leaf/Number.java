package main.calculator.leaf;

import main.calculator.component.ArithmeticExpression;

public class Number implements ArithmeticExpression {

    private final int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public float evaluate() {
        System.out.println("Number value is "+value);
        return value;
    }

}
