package ObserverPattern2;

import java.util.ArrayList;
import java.util.List;

public class NewsMachine implements Publisher {
    private List<Observer> observers;
    private String title;
    private String news;

    public NewsMachine() {
        this.observers = new ArrayList<>();
    }

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void delete(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(title, news);
        }
    }

    public void changeNewsInfo(String title, String news){
        this.title = title;
        this.news = news;
        notifyObserver();
    }



}
