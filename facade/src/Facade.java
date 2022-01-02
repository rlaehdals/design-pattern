public class Facade {

    private Calculator calculator;
    private Print print;

    public Facade(Calculator calculator, Print print) {
        this.calculator = calculator;
        this.print = print;
    }

    public void execute(double n1, double n2){
        double add = calculator.add(n1, n2);
        print.print(add);
    }
}
