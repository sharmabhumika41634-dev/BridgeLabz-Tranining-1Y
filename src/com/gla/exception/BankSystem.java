package com.gla.exception;

public class BankSystem {
    int balance = 10000;
    public void Withdraw(int amount){
        try{
            if (amount>balance){
                throw new InsufficientBalanceException("Inusfficient blance");
            }
            balance = balance-amount;
            System.out.println("Amount withdrraw sucessfully:"+balance);
        }catch(InsufficientBalanceException e){
            System.out.println("Exception handlel inside method:"+ e.getMessage());
        }
    }
    public static void main(String[] args){

        BankSystem bs = new BankSystem();
        bs.Withdraw(200000);
        System.out.println("program continues...");

    }
}
