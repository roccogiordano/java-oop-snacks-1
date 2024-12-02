// Class Definition

public class BankAccount {

    // Instance Variables Declaration

    private int customerReference;
    private int balance;


    //


    // BankAccount Methods

    public BankAccount(int customerReference) {

        this.customerReference = customerReference;

        this.balance = 0;

    }

    public void deposit(int depositAmount) {

        this.balance = balance + depositAmount;

    }

    public void withdrawal(int withdrawalAmount) {

        this.balance = balance - withdrawalAmount;

    }

    public int getBalance() {

        return balance;

    }


    //

}

//
