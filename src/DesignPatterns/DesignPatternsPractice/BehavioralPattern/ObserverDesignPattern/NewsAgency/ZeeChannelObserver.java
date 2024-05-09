package DesignPatterns.DesignPatternsPractice.BehavioralPattern.ObserverDesignPattern.NewsAgency;

public class ZeeChannelObserver implements ChannelObserver{
    private String news;
    private NewsChannelObservableImpl newsChannelObservable;

    public ZeeChannelObserver(NewsChannelObservableImpl newsChannelObservable) {
        this.newsChannelObservable = newsChannelObservable;
    }

    public void setNews(String news) {
        this.news = news;
    }


    @Override
    public void update() {
        setNews(newsChannelObservable.getNews());
        System.out.println("News: "+news+" newsChannelNews: "+newsChannelObservable.getNews());
    }
}
