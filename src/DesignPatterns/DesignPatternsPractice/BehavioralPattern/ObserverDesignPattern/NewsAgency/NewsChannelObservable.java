package DesignPatterns.DesignPatternsPractice.BehavioralPattern.ObserverDesignPattern.NewsAgency;

public interface NewsChannelObservable {
    void add(ChannelObserver channelObserver);
    void remove(ChannelObserver channelObserver);
    void notifyObservable();

}
