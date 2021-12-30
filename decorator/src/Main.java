public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.setString("real");
        printer = new AddEnglish(printer);
        printer = new AddZero(printer);
        printer = new AddStar(printer);

        String print = printer.print();
        System.out.println(print);
    }
}
