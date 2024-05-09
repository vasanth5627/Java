package DesignPatterns.DesignPatternsPractice.BehavioralPattern.ChainOfResponsibility.Logger;

public class Main {
    public static void main(String[] args) {
        LogProcessor obj = new InfoLogProcessor(new DebuggerLogProcessor(new ErrorLogProcessor(null)));
        obj.log(LogProcessor.ERROR,"error happens");
        obj.log(LogProcessor.DEBUG,"debug happens");
        obj.log(LogProcessor.INFO,"info happens");
    }
}
