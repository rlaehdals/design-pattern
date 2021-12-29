import java.util.ArrayList;
import java.util.List;

public class Calculator implements Subject{

    private List<Observer> observerList;
    private double n1;
    private double n2;
    public Calculator() {
        observerList = new ArrayList<>();
    }

    public void setNumber(double n1, double n2){
        this.n1=n1;
        this.n2=n2;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer ob: observerList){
            ob.update(n1,n2);
        }
    }
}
