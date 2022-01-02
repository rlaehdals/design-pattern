import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Calculator calculator = new Calculator();
        boolean run = true;
        while (run) {
            run = calculator.run();
        }
    }
}