public class AddStarCalculator extends CalculatorTemplate{

    @Override
    public String decorate() {
        double num = getNum();
        StringBuilder sb= new StringBuilder();
        sb.append("*").append(num).append("*");
        return sb.toString();
    }
}
