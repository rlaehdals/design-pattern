public abstract class CalculatorTemplate {

    private double num;

    public String execute(double n1, double n2){
        this.num=n1+n2;
        String decorate = decorate();
        return decorate;
    }

    public double getNum() {
        return num;
    }

    public abstract String decorate();
}
