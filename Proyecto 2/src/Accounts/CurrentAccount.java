package Accounts;

public class CurrentAccount extends Account{
    protected boolean active;

    public CurrentAccount(float balance, float annualRate) {
        super(balance, annualRate);

        if(balance < 10000){
            active = false;
        }else{
            active = true;
        }
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public void consign(float amount){
        if(active == true) {
            balance += amount;
            numberConsignments++;
        }else{
            System.out.println("La cuenta no esta activa");
        }
    }

    @Override
    public void withdraw(float amount){
        if(active == true){
            float newBalance = balance - amount;
            if(newBalance >= 0){
                balance -= amount;
                numberWithdrawals++;
            }else{
                System.out.println("La cantidad a retirar excede el saldo actual.");
            }
        }else{
            System.out.println("La cuenta no esta activa");
        }
    }

    @Override
    public void calculateInterest(){
        float monthlyRate = annualRate / 12;
        float monthlyInterest = balance * monthlyRate;

        if(numberWithdrawals > 4){
            balance += 1000;
        }else {
            balance += monthlyInterest;
        }

        if(balance < 10000){
            active = false;
        }else{
            active = true;
        }
    }
    @Override
    public void monthlyStatement(){
        balance -= monthlyCommission;
        calculateInterest();
    }
}
