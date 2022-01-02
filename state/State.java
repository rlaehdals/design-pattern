public interface State {
    default void processNumber(int n){}
    default void processOperator(char ch){}
}
