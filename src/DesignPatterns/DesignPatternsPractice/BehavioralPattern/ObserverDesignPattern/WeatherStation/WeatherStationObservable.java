package DesignPatterns.DesignPatternsPractice.BehavioralPattern.ObserverDesignPattern.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservable implements Observable{
    List<Observer> observerList = new ArrayList<>();
    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        if(!observerList.isEmpty()){
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer :
                observerList) {
            observer.update();

        }
    }

    public double getTemperature(){
        return Math.random()*10;
    }
}
