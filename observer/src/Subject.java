public interface Subject {
    void addObserver(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
