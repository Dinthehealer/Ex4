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

/**
 *
 * @author sarun
 */
public class BankFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<AccountIf> cust1Accounts = new ArrayList();
        ArrayList<AccountIf> cust1Accounts2 = new ArrayList();
        CustomerIf cust1 = new BankCustomer("John", cust1Accounts);
        CustomerIf cust2 = new BankCustomer("Vito", cust1Accounts2);
        Bank_FacadeClass BF=new Bank_FacadeClass();
        BF.doDeposit(500,cust1,12345);
        BF.doDeposit(1000,cust1,12346);
        BF.doDeposit(1500,cust2,12347);
        BF.doDeposit(2000,cust2,12348);
        BF.doDeposit(2000,cust2,12348);
        BF.getBankAccount(cust1,12345);
        BF.getBankAccount(cust1,12346);
        BF.getBankAccount(cust2,12347);
        BF.getBankAccount(cust2,12348);
        BF.getBanCustomer("John");
        BF.getBanCustomer("Vito");
        
    }
        
}
