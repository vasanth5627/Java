package DesignPatterns.DesignPatternsPractice.BehavioralPattern.ObserverDesignPattern.NewsAgency;

import java.util.ArrayList;
import java.util.List;

public class NewsChannelObservableImpl implements NewsChannelObservable {
    private String news;
    List<ChannelObserver> observerList = new ArrayList<>();

    @Override
    public void add(ChannelObserver channelObserver) {
        observerList.add(channelObserver);
    }

    @Override
    public void remove(ChannelObserver channelObserver) {
        observerList.remove(channelObserver);
    }

    @Override
    public void notifyObservable() {
        for (ChannelObserver observer:
             observerList) {
            observer.update();
        }
    }

    public void setNews(String news){
        this.news = news;
        notifyObservable();

    }

    public String getNews() {
        return news;
    }
}
