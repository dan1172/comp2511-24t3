package calculator;

public class Calculator {
    private Expression expression;

    public Calculator(Expression expression) {
        this.expression = expression;
    }

    /**
     * @return computed expression
     */
    public double calculate() {
        return expression.compute();
    }
}
