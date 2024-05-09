package DesignPatterns.DesignPatternsPractice.BehavioralPattern.ChainOfResponsibility.Logger;


public class DebuggerLogProcessor extends LogProcessor {
    public DebuggerLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message){
       if(logLevel == DEBUG){
           System.out.println("DEBUG: "+message);
       }
       else{
           super.log(logLevel,message);
       }
    }
}
