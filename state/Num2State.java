public class Num2State implements State{
    private Calculator calculator;

    public Num2State(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void processOperator(char ch) {
        calculator.printOutResult();
        calculator.setState(calculator.getStartState());
    }
}
