public class Main {
    public static void main(String[] args) {

        int accountAmount;
        int balance = 300;
        int refill = 2000;
        if (refill > 1000) {
            accountAmount = balance + refill + refill / 100;
            System.out.println("Your bonus: " + refill / 100);
        } else {
            accountAmount = balance + refill;
        }

        System.out.println("In your account: " + accountAmount);
    }

}