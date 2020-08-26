/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Din_z
 */
class Bank_FacadeClass {
    ArrayList<AccountIf> cust1Accounts = new ArrayList();
    ArrayList<AccountIf> cust1Accounts2 = new ArrayList();
    CustomerIf cust1 = new BankCustomer("John", cust1Accounts);
    CustomerIf cust2 = new BankCustomer("Vito", cust1Accounts2);
    //int acc0=12345,acc1=12346,acc2=12347,acc3=12348;
    public void doDeposit(double amt,CustomerIf cust, int accNo){
        AccountIf acc;
       if(cust.getCustomerName()=="John"){
           acc=cust1.getAccount(accNo);
           if(acc!=null){
               acc.deposit(amt);return; 
           }else{
           acc = new BankAccount(accNo);
           acc.deposit(amt);
           cust1Accounts.add(acc);
           CustomerIf cust1 = new BankCustomer("John", cust1Accounts);}
       }
       if(cust.getCustomerName()=="Vito"){
           acc=cust2.getAccount(accNo);
           if(acc!=null){
               acc.deposit(amt);return; 
           }else{
           acc = new BankAccount(accNo);
           acc.deposit(amt);
           cust1Accounts2.add(acc);
           CustomerIf cust1 = new BankCustomer("Vito", cust1Accounts2);}
       }
    }
    public void getBankAccount(CustomerIf cust, int accNo){
       AccountIf acc ;
       if(cust.getCustomerName()=="John"){
       acc = cust1.getAccount(accNo);
       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
       }
       if(cust.getCustomerName()=="Vito"){
       acc = cust2.getAccount(accNo);
       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance()); 
       }
    }
    public void getBanCustomer(String custName){
        if(custName==("John")){
            ArrayList<AccountIf> accounts1;
            accounts1=cust1.getllAccounts();
            AccountIf account = null;
            System.out.println("Customer and account information");
            System.out.println("Name = " + cust1.getCustomerName());
            System.out.println("Has " + cust1.getNumAccounts() + " accounts");
            for (int i = 0 ; i < accounts1.size (); i++) {
                account = accounts1.get(i);
                System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
            }
        }
        if(custName==("Vito")){
            ArrayList<AccountIf> accounts2;
            accounts2=cust2.getllAccounts();
            AccountIf account = null;
            System.out.println("Customer and account information");
            System.out.println("Name = " + cust2.getCustomerName());
            System.out.println("Has " + cust2.getNumAccounts() + " accounts");
            for (int i = 0 ; i < accounts2.size (); i++) {
                account = accounts2.get(i);
                System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
            }
        }
        
    }
}
