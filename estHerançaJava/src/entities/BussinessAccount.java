package entities;

/* Classe Business Account tem todos os dados e comportamentos da classe Account
 todos os atributos e métodos */
public class BussinessAccount extends Account {

    private Double loanLimit;

    public BussinessAccount() {
    super();
    }

    public BussinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
         }
    }

    @Override
    public void withdraw(double amount) {
    // Reutilização do código da superclasse     
        super.withdraw(amount);
        balance -= 2.0;
    }






}


