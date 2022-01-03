public class Main {
    public static void main(String[] args) {

        // . 을 추가하는 template
        CalculatorTemplate template1 = new AddDotCalculator();
        String result1 = template1.execute(1, 2);
        System.out.println(result1);


        // star 을 추가하는 template
        CalculatorTemplate template2 = new AddStarCalculator();
        String result2 = template2.execute(3, 4);
        System.out.println(result2);

    }
}