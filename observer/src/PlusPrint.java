public class PlusPrint implements Observer{
    @Override
    public void update(double n1, double n2) {
        System.out.println(n1+n2);
    }
}
