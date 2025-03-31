package neetcode.courses.designpatterns.behaviourals.observer.exercise.subjects;

import java.util.ArrayList;
import java.util.List;

import neetcode.courses.designpatterns.behaviourals.observer.exercise.observers.Observer;

public class OnlineItemStore {
    
    private String itemName;

    private int stock;

    private List<Observer> observers = new ArrayList<>();

    public OnlineItemStore(String itemName, int stock) {
        this.itemName = itemName;
        this.stock = stock;
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void updateStock(int newStock) {
        int oldStock = stock;
        this.stock = newStock;

        if (oldStock == 0 && newStock > 0) {
            notifyObservers();
        }
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.notify(itemName);
        }
    }
}
