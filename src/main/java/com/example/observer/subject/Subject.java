package com.example.observer.subject;

import com.example.observer.observer.Observer;

/**被观察者借口*/
public interface Subject {
    void registerObserver(Observer ob);

    void removeObserver(Observer ob);

    void notifyObservers();
}
