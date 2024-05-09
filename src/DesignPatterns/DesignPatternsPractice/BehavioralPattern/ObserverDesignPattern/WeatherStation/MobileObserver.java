package DesignPatterns.DesignPatternsPractice.BehavioralPattern.ObserverDesignPattern.WeatherStation;

public class MobileObserver implements Observer{
    private WeatherStationObservable weatherStationObservable;

    public MobileObserver(WeatherStationObservable weatherStationObservable) {
        this.weatherStationObservable = weatherStationObservable;
    }

    @Override
    public void update() {
        System.out.println(this.weatherStationObservable.getTemperature()+" temperature updated");
    }
}
