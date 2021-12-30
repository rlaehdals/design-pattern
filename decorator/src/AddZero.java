public class AddZero extends Decorator{


    private Printer printer;

    public AddZero(Printer printer) {
        this.printer = printer;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        String string = printer.print();
        sb.append(0).append(string).append(0);
        return sb.toString();
    }
}
