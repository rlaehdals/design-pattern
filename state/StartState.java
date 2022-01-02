public class StartState implements State{
    private Calculator calculator;

    public StartState(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void processNumber(int n) {
        calculator.setNum1(n);
        calculator.setState(calculator.getNum1State());
    }
}
