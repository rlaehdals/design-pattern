public class Num1State implements State{
    private Calculator calculator;

    public Num1State(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void processOperator(char ch) {
        calculator.setOperator(ch);
        calculator.setState(calculator.getOperatorState());
    }
}
