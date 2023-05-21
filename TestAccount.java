public class TestAccount {
    public static void main(String[] args) {
        Account account1 = new Account("123456", "John Doe", 5000);
        Account account2 = new Account("987654", "Jane Smith", 4000);

        System.out.println("Account 1 Balance: $" + account1.getBalance());
        System.out.println("Account 2 Balance: $" + account2.getBalance());

        int transferAmount = 1000;
        account1.transferTo(account2, transferAmount);

        System.out.println("\nAfter transferring $" + transferAmount + " from Account 1 to Account 2:");
        System.out.println("Account 1 Balance: $" + account1.getBalance());
        System.out.println("Account 2 Balance: $" + account2.getBalance());
    }
}
