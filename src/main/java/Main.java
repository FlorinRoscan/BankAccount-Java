public class Main {

    public static void main(String[] args) {
        BankAccount johnAccount = new BankAccount("John Smith", "RO29RBOS60161331926819");
        BankAccount janeAccount = new BankAccount("Jane Doe", "RO29RBOS60161331926820");
        BankAccount bobAccount = new BankAccount("Bob Johnson", "RO29RBOS60161331926821");
        BankAccount saraAccount = new BankAccount("Sara Lee", "RO29RBOS60161331926822");

        // Test the John Smith account
        johnAccount.balance_query();
        johnAccount.account_activation(7777);
        johnAccount.feed_account(1000);
        johnAccount.card_payment(500);
        johnAccount.balance_query();

        // Test the Jane Doe account
        janeAccount.balance_query();
        janeAccount.account_activation(1234);
        janeAccount.feed_account(2000);
        janeAccount.card_payment(1500);
        janeAccount.balance_query();

        // Test the Bob Johnson account
        bobAccount.balance_query();
        bobAccount.account_activation(4321);
        bobAccount.feed_account(500);
        bobAccount.card_payment(1000);
        bobAccount.balance_query();

        // Test the Sara Lee account
        saraAccount.balance_query();
        saraAccount.account_activation(1111);
        saraAccount.feed_account(3000);
        saraAccount.card_payment(2000);
        saraAccount.balance_query();
    }
}