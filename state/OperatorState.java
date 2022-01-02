public class OperatorState implements State{
    private Calculator calculator;

    public OperatorState(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void processNumber(int n) {
        calculator.setNum2(n);
        calculator.setState(calculator.getNum2State());

    }
}
