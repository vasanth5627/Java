package DesignPatterns.DesignPatternsPractice.BehavioralPattern.ObserverDesignPattern.NewsAgency;

public class Main {
    public static void main(String[] args) {
        NewsChannelObservableImpl newsChannelObservable = new NewsChannelObservableImpl();
        ChannelObserver zeeNews = new ZeeChannelObserver(newsChannelObservable);
        ChannelObserver sunNews = new SunChannelObserver(newsChannelObservable);
        newsChannelObservable.observerList.add(zeeNews);
        newsChannelObservable.observerList.add(sunNews);
        newsChannelObservable.setNews("new news");

    }
}
