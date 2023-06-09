package DesignPatterns.Structural.AdapterDesignPattern;

import OOPS.InterfaceDemo.ExtendsDemo.A;

public class School {
    public static void main(String[] args) {
        PenAdapter p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssignment("HI");
    }
}
