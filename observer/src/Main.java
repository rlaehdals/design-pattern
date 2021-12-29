public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        PlusPrint plusPrint = new PlusPrint();
        MinusPrint minusPrint = new MinusPrint();

        // plus observer 추가
        calculator.addObserver(plusPrint);
        // 숫자 변경
        calculator.setNumber(1,2);

        // minus observer 추가
        calculator.addObserver(minusPrint);
        // 숫자 변경
        calculator.setNumber(3,7);


        // plus observer 제거
        calculator.remove(plusPrint);
        // 숫자 변경
        calculator.setNumber(5,0);


    }
}
