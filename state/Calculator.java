import java.util.*;

public class Calculator {
    Scanner scanner;
    String inputStr;
    int num1;
    int num2;
    State state;
    char operator;
    State startState;
    State num1State;
    State operatorState;
    State num2State;


    public Calculator() {
        this.startState = new StartState(this);
        this.num1State = new Num1State(this);
        this.operatorState = new OperatorState(this);
        this.num2State = new Num2State(this);
        state = startState;
        scanner = new Scanner(System.in);
    }


    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setState(State state) {
        this.state = state;
    }


    public void setOperator(char op) {
        operator = op;
    }

    public State getStartState() {
        return startState;
    }

    public State getNum1State() {
        return num1State;
    }

    public State getOperatorState() {
        return operatorState;
    }

    public State getNum2State() {
        return num2State;
    }

    public String getInput(String s) {
        System.out.println(s);
        return scanner.next();
    }

    public void printOutResult() {
        switch (operator) {
            case '+':
                System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
                break;

            case '-':
                System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
                break;

            case '*':
                System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
                break;

            case '/':
                System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
                break;
        }
    }


    public void processNumber(String ch) {
        state.processNumber(Integer.parseInt(ch));
    }

    public void processOperator(char ch) {
        state.processOperator(ch);
    }

    public boolean run() {
        inputStr = getInput("정수 또는 +,-,*,/,= 기호 중 한 개를 입력하세요");
        char ch = inputStr.charAt(0);
        if (ch == 'q' || ch == 'Q') {
            return false;
        } else if (ch >= '0' && ch <= '9') {
            processNumber(inputStr);
        } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '=') {
            processOperator(ch);
        }
        return true;
    }
}
