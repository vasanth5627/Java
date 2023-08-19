package DesignPatterns.Behavioural.StateDrivenDesignPattern.States;

import DesignPatterns.Behavioural.StateDrivenDesignPattern.VendingMachine.VendingMachine;

public class NoCoinInsertedState implements State{
    private VendingMachine vendingMachine;

    public NoCoinInsertedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(double amount) {
        vendingMachine.setAmount(amount);
        vendingMachine.setCurVendingState(vendingMachine.getCoinInsertedState());
    }

    @Override
    public void pressButton(int aisleNumber) {
        throw new IllegalStateException("No Coin Inserted");
    }

    @Override
    public void dispense(int aisleNumber) {
        throw new IllegalStateException("No Coin Inserted");

    }
}
