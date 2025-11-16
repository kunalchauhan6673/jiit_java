class InsufficientfundException extends Exception{
    InsufficientfundException(String msg){
        super(msg);
    }
}
class InvalidAmountException extends Exception{
    InvalidAmountException(String msg){
        super(msg);
    }
}
class InvalidAccountNumberException extends Exception{
    InvalidAccountNumberException(String msg){
        super(msg);
    }
}

public class CustomExcep02 {
    double balance;
    int account_number;
    CustomExcep02(int account_number) throws InvalidAccountNumberException{
        if(account_number<=0){
            throw new InvalidAccountNumberException("Invalid Account number!");
        }
        this.account_number=account_number;
        balance=0 ;
        
    }
    void deposit(double amount) throws InvalidAmountException{
        if(amount<=0){
            throw new InvalidAmountException("Invalid Amount, amount must be positive!");
        }
        balance+=amount;
    }
    void withdraw(double amount) throws InvalidAmountException, InsufficientfundException{
        if(amount>balance){
            throw new InsufficientfundException("Insufficient amount in the account!");
        }
        if(amount<=0){
            throw new InvalidAmountException("Invalid Amount, amount must be positive!");
        }
        balance-=amount;
    }
    double getBalance(){
        return balance;
    }
    public static void main(String[] args){
        try {
            CustomExcep02 acc = new CustomExcep02(10);
            System.out.println("Balance: " + acc.getBalance());
            acc.deposit(500);
            System.out.println("Balance: " + acc.getBalance());
            acc.withdraw(200);
            System.out.println("Balance: " + acc.getBalance());
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
