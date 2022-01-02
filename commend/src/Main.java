
public class Main {
    public static void main(String[] args) {
        MinusCalculator minusCalculator = new MinusCalculator();
        AddCalculator addCalculator = new AddCalculator();

        People people = new People();
        // 0 번째 index 에 minus 계산기 명령어를 수행하는 객체 추가
        people.addCommend(minusCalculator);

        // 1 번째 index 에 add 계산기 명령어를 수행하는 객체 추가
        people.addCommend(addCalculator);

        // minus 계산기 사용
        double result1 = people.execute(0, 1, 2);

        // add 계산기 사용
        double result2 = people.execute(1, 1, 2);

        System.out.println(result1);
        System.out.println(result2);
    }
}
