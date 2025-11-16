import java.util.Scanner;

class InsufficientfundException extends Exception {
    InsufficientfundException(String msg) {
        super(msg);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}

class InvalidAccountNumberException extends Exception {
    InvalidAccountNumberException(String msg) {
        super(msg);
    }
}

public class CustomExcep02Polished {
    double balance;
    int account_number;

    CustomExcep02Polished(int account_number) throws InvalidAccountNumberException {
        if (account_number <= 0) {
            throw new InvalidAccountNumberException("Invalid Account number!");
        }
        this.account_number = account_number;
        balance = 0;
    }

    void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid Amount, amount must be positive!");
        }
        balance += amount;
    }

    void withdraw(double amount)
            throws InvalidAmountException, InsufficientfundException {

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid Amount, amount must be positive!");
        }

        if (amount > balance) {
            throw new InsufficientfundException("Insufficient amount in the account!");
        }

        balance -= amount;
    }

    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomExcep02Polished acc = null;

        try {
            System.out.print("Enter account number to create account: ");
            int accNo = sc.nextInt();
            acc = new CustomExcep02Polished(accNo);
            System.out.println("Account created successfully!");
        }
        catch (InvalidAccountNumberException e) {
            System.out.println("Error: " + e.getMessage());
            return;  
        }

        while (true) {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depAmt = sc.nextDouble();
                        acc.deposit(depAmt);
                        System.out.println("Amount deposited!");
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double wAmt = sc.nextDouble();
                        acc.withdraw(wAmt);
                        System.out.println("Amount withdrawn!");
                        break;

                    case 3:
                        System.out.println("Current Balance: " + acc.getBalance());
                        break;

                    case 4:
                        System.out.println("Thank you! Exiting...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            }
            catch (InvalidAmountException | InsufficientfundException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

