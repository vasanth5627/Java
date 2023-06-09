package DesignPatterns.Behavioural.ObserverDesignPattern.Observer;

import DesignPatterns.Behavioural.ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String userName, StockObservable observable) {
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendOnMobile(userName, "Product is now in stock");
    }

    private void sendOnMobile(String userName, String msg) {
        System.out.println("Message sent to: "+userName);
    }
}
