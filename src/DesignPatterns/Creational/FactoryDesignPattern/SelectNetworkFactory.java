package DesignPatterns.Creational.FactoryDesignPattern;

import java.util.Scanner;

public class SelectNetworkFactory {
    public  CellularPlan getPlan(String planType) {
        if (planType == null) return null;
        if (planType.equalsIgnoreCase("abcNetwork")) return new abcNetwork();
        if (planType.equalsIgnoreCase("pqrNetwork")) return new pqrNetwork();
        if (planType.equalsIgnoreCase("xyzNetwork")) return new xyzNetwork();
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Network");
        String network = sc.next();
        SelectNetworkFactory s  = new SelectNetworkFactory();
        CellularPlan plan = s.getPlan(network);
        System.out.println("Enter the minutes");
        int minutes = sc.nextInt();
        plan.getRate();
        plan.processBill(minutes);
    }
}
