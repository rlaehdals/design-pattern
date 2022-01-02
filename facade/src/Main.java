


public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Print print = new Print();

        Facade facade = new Facade(calculator,print);

        People people = new People(facade);

        facade.execute(1,2);
    }
}
