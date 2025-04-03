package main.calculator.composite;

import main.calculator.ArithmeticOperation;
import main.calculator.component.ArithmeticExpression;

public class Expression implements ArithmeticExpression {

    private final ArithmeticExpression leftExpression;

    private final ArithmeticExpression rightExpression;

    private final ArithmeticOperation arithmeticOperation;

    public Expression(ArithmeticExpression leftExpression, ArithmeticExpression rightExpression,
                      ArithmeticOperation arithmeticOperation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.arithmeticOperation = arithmeticOperation;
    }

    @Override
    public float evaluate() {

        float result = 0;

        switch (arithmeticOperation){
            case ADD -> result = leftExpression.evaluate() + rightExpression.evaluate();
            case DIVIDE -> result = leftExpression.evaluate() / rightExpression.evaluate();
            case MULTIPLY -> result = leftExpression.evaluate() * rightExpression.evaluate();
            case SUBTRACT -> result = leftExpression.evaluate() - rightExpression.evaluate();
            default -> System.out.println("Invalid operation");
        }

        System.out.println("Expression value is "+result);

        return result;

    }
}
