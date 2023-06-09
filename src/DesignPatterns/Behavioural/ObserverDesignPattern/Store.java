package DesignPatterns.Behavioural.ObserverDesignPattern;

import DesignPatterns.Behavioural.ObserverDesignPattern.Observable.IphoneObservableImpl;
import DesignPatterns.Behavioural.ObserverDesignPattern.Observable.StockObservable;
import DesignPatterns.Behavioural.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import DesignPatterns.Behavioural.ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import DesignPatterns.Behavioural.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com",iphoneObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@gmail.com",iphoneObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("xyz_userName",iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setStockCount(10);
    }
}
