import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

// Observer interface
interface Observer {
    void update();
}

// Subject class
public class TransListData extends AbstractListModel {
    private Vector data;
    private ArrayList<Observer> observers;

    public TransListData() {
        data = new Vector();
        observers = new ArrayList<>();
    }

    public int getSize() {
        return data.size();
    }

    public Object getElementAt(int index) {
        return data.elementAt(index);
    }

    @SuppressWarnings("unchecked")
    public void addElement(Transaction transaction) {
        data.addElement(transaction);
        fireIntervalAdded(this, data.size() - 1, data.size());
        notifyObservers();
    }

    public void removeElement(Transaction s) {
        int index = data.indexOf(s);
        if (index > -1) {
            data.remove(index);
            fireIntervalRemoved(this, index, data.size());
            notifyObservers();
        }
    }

    // Register observer
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Remove observer
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notify observers
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}


