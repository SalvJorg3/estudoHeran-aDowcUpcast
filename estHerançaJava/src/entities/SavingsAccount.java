package entities;

public class SavingsAccount extends Account {

    private Double interestedRate;
    public SavingsAccount() {
        super();
    }
    
    public SavingsAccount(Integer number, String holder, Double balance, Double interestedRate) {
        super(number, holder, balance);
        this.interestedRate = interestedRate;
   }

   public Double getInterestedRate() {
       return interestedRate;
   }

   public void setInterestedRate(Double interestedRate) {
    this.interestedRate = interestedRate;
   }

   public void updateBalance() {
    balance += balance * interestedRate;
   }


   /* Indicação para o compilador de sobreposição de método */
   @Override
   public void withdraw(double amount) {
    balance -= amount;
   }

}
