package ObserverPattern2;

public interface Publisher {
    void add(Observer observer);
    void delete(Observer observer);
    void notifyObserver();
}
