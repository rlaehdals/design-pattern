public class People {
    private Facade facade;

    public People(Facade facade) {
        this.facade = facade;
    }

    public void execute(double n1, double n2){
        facade.execute(n1, n2);
    }
}
