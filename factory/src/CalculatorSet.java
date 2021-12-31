public class CalculatorSet {
    public Calculator orderCalculator(String name){
        if(name.equals("add")){
            return new AddCalculator();
        }
        else if(name.equals("minus")){
            return new MinusCalculator();
        }
        else if(name.equals("mul")){
            return new MulCalculator();
        }
        else{
            return new DivCalculator();
        }
    }
}
