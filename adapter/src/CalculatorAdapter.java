public class CalculatorAdapter extends LinuxCalculator{
    private WindowCalculator calculator;


    public CalculatorAdapter(WindowCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double execute(double n1, double n2) {
        return calculator.execute(n1, n2);
    }
}
