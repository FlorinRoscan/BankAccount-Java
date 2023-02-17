public class BankAccount {

    private String account_holder;
    private String iban;
    private int hip;
    private boolean active;
    private int pin;
    private int number_of_attempts;

    public BankAccount(String account_holder, String iban) {
        this.account_holder = account_holder;
        this.iban = iban;
        this.hip = 0;
        this.active = false;
        this.pin = 7777;
        this.number_of_attempts = 0;
    }

    public void balance_query() {
        System.out.println("Holder " + this.account_holder);
        System.out.println("IBAN " + this.iban);
        System.out.println("Hip " + this.hip);
        System.out.println("Active " + this.active);
        System.out.println("Number of attempts " + this.number_of_attempts);
        System.out.println("-----------------------------------------------");
    }

    public void account_activation(int user_pin) {
        hello();
        if (user_pin == this.pin) {
            System.out.println("The card has been activated");
            this.active = true;
        } else {
            System.out.println("Wrong PIN");
            this.number_of_attempts++;
        }
    }

    public void feed_account(int the_amount) {
        hello();
        this.hip += the_amount;
        System.out.println("You fed " + the_amount);
        System.out.println("You have in account " + this.hip);
    }

    public void card_payment(int the_amount) {
        hello();
        if (the_amount <= this.hip) {
            this.hip -= the_amount;
            System.out.println("You spent " + the_amount);
            System.out.println("You have in account " + this.hip);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void hello() {
        System.out.println("Hello " + this.account_holder);
    }
}
