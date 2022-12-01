import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BussinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*Account acc = new Account(1001, "Alex", 0.0);
        BussinessAccount bacc = new BussinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING 

        Account acc1 = bacc;
        Account acc2 = new BussinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01); */
       
        //DOWNCASTING 

       /*  BussinessAccount acc4 = (BussinessAccount)acc2;
        acc4.loan(100.0);
    
        /* Dá erro porque acc3 é SavingsAccount, que é uma account
        mas não é uma BusinessAccount (erro em tempo de execuçâo
        BussinessAccount acc5 = (BussinessAccount)acc3; */

        /* if (acc3 instanceof BussinessAccount) {
            BussinessAccount acc5 = (BussinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan");
        }
        
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update");
        } 

    

    } */ 
 
        /*   Account acc1 = new Account(1001, "Alex", 1000.0);
            acc1.withdraw(200.0);
            System.out.println(acc1.getBalance());

            Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
            acc2.withdraw(200.0);
            System.out.println(acc2.getBalance());

            Account acc3 = new BussinessAccount(1003, "Bob", 1000.0, 500.0);
            acc3.withdraw(200.0);
            System.out.println(acc3.getBalance()); */


          List<Account> list = new ArrayList<>();

          list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
          list.add(new BussinessAccount(1002, "Maria", 1000.0, 400.0));
          list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
          list.add(new BussinessAccount(1005, "Anna", 500.0, 500.0));

          /* Soma de todos os saldos (independente
          do tipo de conta) */

          double sum = 0.0;
          for (Account acc : list) {
            sum += acc.getBalance();
          }

          /* Depositar o valor 10 em cada conta */

          for(Account acc : list) {
            acc.deposit(10.0);
          }

          for(Account acc: list) {
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
          }

          System.out.printf("Total balance: %.2f%n", sum);
}
}
