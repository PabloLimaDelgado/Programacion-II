import Accounts.*;

public class Main {
    public static void main(String[] args) {

        /*CurrentAccount ca1 = new CurrentAccount(12000f, 12f);

        ca1.consign(2000f);
        ca1.withdraw(1000f);

        ca1.monthlyStatement();
        ca1.print();

        ca1.withdraw(500f);
        ca1.withdraw(500f);
        ca1.withdraw(500f);

        ca1.monthlyStatement();

        ca1.print();*/

        SavingsAccount sa1 = new SavingsAccount(12000f, 12f);

        sa1.withdraw(13000);
        sa1.consign(500);
        sa1.consign(1000);
        sa1.withdraw(1000);
        sa1.print();

        sa1.monthlyStatement();


    }
}