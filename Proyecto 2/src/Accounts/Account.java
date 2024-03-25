package Accounts;

public abstract class Account {
    protected float balance;
    protected int numberConsignments = 0;
    protected int numberWithdrawals = 0;
    protected float annualRate;
    protected float monthlyCommission = 0;

    public Account(float balance, float annualRate) {
        this.balance = balance;
        this.annualRate = annualRate;
    }

    public void consign(float amount){
        balance += amount;
        numberConsignments++;
    }

    public void withdraw(float amount){
        float newBalance = balance - amount;
        if(newBalance >= 0){
            balance -= amount;
            numberWithdrawals++;
        }else{
            System.out.println("La cantidad a retirar excede el saldo actual.");
        }
    }

    public void calculateInterest(){
        float monthlyRate = annualRate / 12;
        float monthlyInterest = balance * monthlyRate;
        balance += monthlyInterest;
    }

    public void monthlyStatement(){ //Extracto mensual
        balance -= monthlyCommission;
        calculateInterest();
    }

    public void print(){
        System.out.println("El balance es: " + balance);
        System.out.println("El número de envios es: " + numberConsignments);
        System.out.println("El número de retiros es: " + numberWithdrawals);
        System.out.println("La tasa anual es: " + annualRate);
        System.out.println("La comision mensual es: " + monthlyCommission);
    }
}
