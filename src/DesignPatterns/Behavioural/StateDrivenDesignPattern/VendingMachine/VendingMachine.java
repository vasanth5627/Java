package DesignPatterns.Behavioural.StateDrivenDesignPattern.VendingMachine;

import DesignPatterns.Behavioural.StateDrivenDesignPattern.Inventory.Inventory;
import DesignPatterns.Behavioural.StateDrivenDesignPattern.Inventory.Product;
import DesignPatterns.Behavioural.StateDrivenDesignPattern.States.CoinInsertedState;
import DesignPatterns.Behavioural.StateDrivenDesignPattern.States.DispenseState;
import DesignPatterns.Behavioural.StateDrivenDesignPattern.States.NoCoinInsertedState;
import DesignPatterns.Behavioural.StateDrivenDesignPattern.States.State;

public class VendingMachine {
    private NoCoinInsertedState noCoinInsertedState;
    private CoinInsertedState coinInsertedState;
    private DispenseState dispenseState;
    private State curVendingState;
    private Inventory inventory;
    private double amount;
    private static final int AISLE_COUNT = 2;

    public VendingMachine() {
        noCoinInsertedState = new NoCoinInsertedState(this);
        coinInsertedState = new CoinInsertedState(this);
        dispenseState = new DispenseState(this);
        curVendingState = noCoinInsertedState;
        amount = 0.0;
        inventory = new Inventory();
    }

    public NoCoinInsertedState getNoCoinInsertedState() {
        return noCoinInsertedState;
    }

    public void setNoCoinInsertedState(NoCoinInsertedState noCoinInsertedState) {
        this.noCoinInsertedState = noCoinInsertedState;
    }

    public CoinInsertedState getCoinInsertedState() {
        return coinInsertedState;
    }

    public void setCoinInsertedState(CoinInsertedState coinInsertedState) {
        this.coinInsertedState = coinInsertedState;
    }

    public DispenseState getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(DispenseState dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getCurVendingState() {
        return curVendingState;
    }

    public void setCurVendingState(State curVendingState) {
        this.curVendingState = curVendingState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean hasSufficientAmount(double expectedAmount){
        return expectedAmount <= this.amount;
    }

    public void insertCoin(double amount){
        this.curVendingState.insertCoin(amount);
        this.curVendingState = coinInsertedState;
        System.out.println(amount+" coin is inserted");
    }

    public void pressButton(int aisleNumber){
        this.curVendingState.pressButton(aisleNumber);
        this.curVendingState.dispense(aisleNumber);
    }

//    public void addProduct(Product product){
//        try{
//            this.getInventory().addProduct(product);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//    }

}
