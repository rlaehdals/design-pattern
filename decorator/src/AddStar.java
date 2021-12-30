public class AddStar extends Decorator{

    private Printer printer;

    public AddStar(Printer printer) {
        this.printer = printer;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        String string = printer.print();
        sb.append('*').append(string).append('*');
        return sb.toString();
    }
}
