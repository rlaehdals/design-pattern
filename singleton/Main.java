public class Main {
    public static void main(String[] args) {
        SingletonCalculator calculator = SingletonCalculator.getCalculator();
        double result1 = calculator.add(1, 2);
        double result2 = calculator.minus(3, 4);

        System.out.println(result1);
        System.out.println(result2);

    }
}