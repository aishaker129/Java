class BankAccount{
    String accountNumber;
    double balance;

    BankAccount(String accounternumber, double balance){
        this.accountNumber = accounternumber;
        this.balance = balance;
    }

    void Deposit(double ammount){
        balance += ammount;
    }

    void widthro(double amount){
        if(amount>=balance){
            System.out.println("Does not enough money");
        }
        else{
            balance -=amount;
        }
    }

    double getBalance(){
        return balance;
    }
}

class Saving extends BankAccount{
    Saving(String s,double taka){
        super(s, taka);
    }

    void widthro(double ammount){
        if(getBalance()-100<=ammount){
            System.out.println("Dose not enough money");
        }
        else{
            super.widthro(ammount);
        }
    }

}
public class Bank{
    public static void main(String[] args) {
        BankAccount b4250 = new BankAccount("b4250", 1000);
        b4250.Deposit(2000);
        System.out.println("b4250 balance is: "+b4250.getBalance());
        b4250.widthro(720);
        System.out.println("b4250 balance is: "+b4250.getBalance());

        // Create Saving Account 

        Saving c4350 = new Saving("c4350", 5000);
        System.out.println("c4350 balance is: "+c4350.getBalance());
        c4350.Deposit(500);
        System.out.println("c4350 balance is: "+c4350.getBalance());
        c4350.widthro(5400);
        System.out.println("c4350 balance is: "+c4350.getBalance());
        c4350.widthro(5200);
        System.out.println("c4350 balance is: "+c4350.getBalance());

    }
}
