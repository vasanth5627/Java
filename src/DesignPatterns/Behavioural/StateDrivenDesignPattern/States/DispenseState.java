package DesignPatterns.Behavioural.StateDrivenDesignPattern.States;

import DesignPatterns.Behavioural.StateDrivenDesignPattern.Inventory.Inventory;
import DesignPatterns.Behavioural.StateDrivenDesignPattern.Inventory.Product;
import DesignPatterns.Behavioural.StateDrivenDesignPattern.VendingMachine.VendingMachine;

public class DispenseState implements State{
    private VendingMachine vendingMachine;

    public DispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(double amount) {
        throw new IllegalStateException("Product is getting dispensed");

    }

    @Override
    public void pressButton(int aisleNumber) {
        throw new IllegalStateException("Product is getting dispensed");
    }

    @Override
    public void dispense(int aisleNumber) {
        Inventory inventory  = vendingMachine.getInventory();
       // Product product = inventory.getProductAt(aisleNumber);

//        inventory.deductProductCount(aisleNumber);
//        double change = vendingMachine.getAmount()-product.getAmount();
//        vendingMachine.setAmount(0);
//        vendingMachine.setCurVendingState(vendingMachine.getNoCoinInsertedState());
//
//        System.out.println("Product with id: "+product.getProductID()+" is dispensed");

    }
}
