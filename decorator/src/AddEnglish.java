public class AddEnglish extends Decorator {


    private Printer printer;

    public AddEnglish(Printer printer) {
        this.printer = printer;
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        String string = printer.print();
        sb.append("H").append(string).append("H");
        return sb.toString();
    }
}
