package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        BankAccount bankAccount=new BankAccount();
        bankAccount.deposit(20000);
       while(bankAccount.getAmount()>0){
            System.out.println("Осталось:"+bankAccount.getAmount()+"|сом");
            try{
                double temp;
                bankAccount.withDraw(temp=sc.nextDouble());
            }catch (LimitException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Баланс:"+bankAccount.getAmount()+"|cом");
    }
}
