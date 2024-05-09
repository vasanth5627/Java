package DesignPatterns.DesignPatternsPractice.BehavioralPattern.ObserverDesignPattern.WeatherStation;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObserver();

}
