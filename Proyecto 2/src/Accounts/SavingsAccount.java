package Accounts;

public class SavingsAccount extends Account{
    protected float overdraft = 0; //sobregiro

    public SavingsAccount(float balance, float annualRate) {
        super(balance, annualRate);
    }

    @Override
    public void withdraw(float amount){
        float newBalance = balance - amount;

        if (newBalance < 0){
            overdraft = newBalance;
            balance = 0;
        }else{
            balance -= amount;
        }
        numberWithdrawals++;
    }

    @Override
    public void consign(float amount){
        float newBalance = 0;

        if(balance == 0){
            newBalance = overdraft + amount;
        }else{
            balance += amount;
        }

        if(newBalance >= 0f){
            balance = newBalance;
            overdraft = 0;
        }else{
            overdraft = newBalance;
        }

        numberConsignments++;
    }

    /*public float getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }*/

    @Override
    public void print(){
        System.out.println("El balance es: " + balance);
        System.out.println("El número de movimientos es: " + (numberWithdrawals + numberConsignments));
        System.out.println("La comision mensual es: " + monthlyCommission);
        System.out.println("El sobregiro es: " + overdraft);
    }
}
