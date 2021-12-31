public class SingletonCalculator {

    public static SingletonCalculator calculator = null;

    private SingletonCalculator() {}

    public static synchronized SingletonCalculator getCalculator() {
        if (calculator == null) {
            calculator = new SingletonCalculator();
        }
        return calculator;
    }

    public double add(double n1, double n2) {
        return n1 + n2;
    }

    public double minus(double n1, double n2) {
        return n1 - n2;
    }
}
