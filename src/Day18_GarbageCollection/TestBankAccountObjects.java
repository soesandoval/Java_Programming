package Day18_GarbageCollection;

public class TestBankAccountObjects {
    public static void main(String[] args) {


        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Sofia", 123456789);

        System.out.println(obj1);

        obj1.deposit(1000);

        obj1.checkBalance();

        obj1.withdraw(700);

        obj1.checkBalance();

        obj1.deposit(-1000);

        obj1.withdraw(1000);

        System.out.println("----------------------------------------------------");

        BankAccount account1 = new BankAccount();

        BankAccount account2 = new BankAccount();

        account1.setInfo("Sebastian", 987654321);

        account2.setInfo("Lorenso", 78965432);

        account1.deposit(6000);

        System.out.println(account1);

        account1.withdraw(1000);




    }
}
