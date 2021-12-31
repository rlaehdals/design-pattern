public class SingletonCalculator {

    public static SingletonCalculator calculator = new SingletonCalculator();

    private SingletonCalculator() {}

    public static SingletonCalculator getCalculator() {
        return calculator;
    }

    public double add(double n1, double n2) {
        return n1 + n2;
    }

    public double minus(double n1, double n2) {
        return n1 - n2;
    }
}