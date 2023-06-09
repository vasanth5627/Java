package DesignPatterns.Behavioural.ObserverDesignPattern.Observer;

import DesignPatterns.Behavioural.ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId,"product is now in stock");

    }

    private void sendEmail(String emailId, String msg) {
        System.out.println("mail to: "+emailId);
    }
}
