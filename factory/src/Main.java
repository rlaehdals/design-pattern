


public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        store.order("add");
        double result1 = store.execute(1, 2);
        System.out.println(result1);

        store.order("minus");
        double result2 = store.execute(3, 5);
        System.out.println(result2);
    }
}
