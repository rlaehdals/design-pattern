


public class Main {
    public static void main(String[] args) {
        People people = new People();

        // 숫자 설정
        people.changeNumber(1,2);

        // Calculator 설정
        people.setCalculator(new PlusCalculator());
        double result1 = people.operate();
        System.out.println(result1);


        // 새로운 Calculator 설정
        people.setCalculator(new MinusCalculator());
        double result2 = people.operate();
        System.out.println(result2);


        // 람다 PlusCalculator
        people.setCalculator((n1,n2)->{
            return n1+n2;
        });
        double result3 = people.operate();
        System.out.println(result3);

        // 람다 MinusCalculator
        people.setCalculator((n1,n2)->{
            return n1-n2;
        });
        double result4 = people.operate();
        System.out.println(result4);

    }
}
