package DesignPatterns.Behavioural.ObserverDesignPattern.Observable;

import DesignPatterns.Behavioural.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubs();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
