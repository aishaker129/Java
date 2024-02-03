class BankAccount{
    String name;
    double balance;
    BankAccount(String s,double bal){
        name = s;
        balance  = bal;
    }

    void Deposit(double ammount){
        balance +=ammount;
    }

    void Withdrow(double ammount){
        if(balance >= ammount){
            balance -=ammount;
        }else{
            System.out.println("Not enough Balance.");
        }
    }

    double getBalance(){
        return balance;
    }


}

class SavingsAccount extends BankAccount{

    double saving;
   
    SavingsAccount(String s,double b,double a){
        super(s,b);
        saving = a;
    }

    void withdrow(double ammount){
        if(getBalance()-ammount<100){
            System.out.println("Balance less than 100 Taka.");
        }else{
            super.Withdrow(ammount);
        }
    }

    void savingAmmount(double ammount){
        saving +=ammount;
    }

    double getsaving(){
        return saving;
    }


}
public class Lab_2_Task_3 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Shaker", 2000);

        b.Deposit(200);
        System.out.println("Account Name:"+b.name+"And Balance is: "+b.getBalance());
        b.Withdrow(2500);

        SavingsAccount s = new SavingsAccount("AI", 5000, 3000);
        s.savingAmmount(500);
        s.withdrow(2150);
        System.out.println("Your Saving Ammount is: "+s.getsaving());
    }
}
