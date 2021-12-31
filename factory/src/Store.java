public class Store {

    private Calculator calculator;
    private CalculatorSet calculatorSet;


    public Store() {
        calculatorSet = new CalculatorSet();
    }

    public void order(String name){
        calculator=calculatorSet.orderCalculator(name);
    }
    public double execute(double n1, double n2){
        return calculator.execute(n1,n2);
    }
}
