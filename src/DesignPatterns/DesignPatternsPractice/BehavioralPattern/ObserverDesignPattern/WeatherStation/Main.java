package DesignPatterns.DesignPatternsPractice.BehavioralPattern.ObserverDesignPattern.WeatherStation;

public class Main {
    public static void main(String[] args) {
        WeatherStationObservable weatherStationObservable = new WeatherStationObservable();
        Observer mobileObserver = new MobileObserver(weatherStationObservable);
        weatherStationObservable.observerList.add(mobileObserver);
        weatherStationObservable.notifyObserver();
    }
}
