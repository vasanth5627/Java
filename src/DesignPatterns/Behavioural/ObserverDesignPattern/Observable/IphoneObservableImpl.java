package DesignPatterns.Behavioural.ObserverDesignPattern.Observable;

import DesignPatterns.Behavioural.ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{
    List<NotificationAlertObserver> observerList  = new ArrayList<>();
    public int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubs() {
        for (NotificationAlertObserver observer:
             observerList) {
            observer.update();

        }

    }

    @Override
    public void setStockCount(int newStockAdded) {
            if(stockCount==0){
                notifySubs();
            }

    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
