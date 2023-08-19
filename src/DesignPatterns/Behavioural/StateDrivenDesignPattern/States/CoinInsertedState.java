package DesignPatterns.Behavioural.StateDrivenDesignPattern.States;

import DesignPatterns.Behavioural.StateDrivenDesignPattern.Inventory.Inventory;
import DesignPatterns.Behavioural.StateDrivenDesignPattern.Inventory.Product;
import DesignPatterns.Behavioural.StateDrivenDesignPattern.VendingMachine.VendingMachine;

public class CoinInsertedState implements State{
    private VendingMachine vendingMachine;

    public CoinInsertedState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }


    @Override
    public void insertCoin(double amount) {
        vendingMachine.setAmount(vendingMachine.getAmount()+amount);
    }

    @Override
    public void pressButton(int aisleNumber) {
//        Inventory inventory = vendingMachine.getInventory();
//        Product product = inventory.getProduct(aisleNumber);
//
//        if(!vendingMachine.hasSufficientAmount(product.getPrice())){
//            throw new IllegalStateException("Insufficient amount to buy this product");
//        }
//
//        if(inventory.checkIfProductAvailable(product.getId())){
//            throw new IllegalStateException("Product Not Available In Stock");
//        }

        vendingMachine.setCurVendingState(vendingMachine.getDispenseState());

    }

    @Override
    public void dispense(int aisleNumber) {

        throw new IllegalStateException("Product not selected");

    }
}
