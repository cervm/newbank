package newbank.server;

import java.util.ArrayList;

/**
 * The type Account.
 */
public class Account {

    private final String accountName;
    private final double openingBalance;
    private final int accountNumber;


    /**
     * Instantiates a new Account.
     *
     * @param accountName    the account name
     * @param openingBalance the opening balance
     * @param accountNumber the accountNumber
     */
    public Account(String accountName, double openingBalance, int accountNumber) {
        this.accountName = accountName;
        this.openingBalance = openingBalance;
        this.accountNumber = accountNumber;
    }

    /**
     * Returns the accountNumber.
     *
     * @return accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Returns the balance.
     *
     * @return openingBalance
     */
    public double getOpeningBalance() {
        return openingBalance;
    }

    /**
     * @return account name
     */
    public String getAccountName() {
        return this.accountName;
    }



    /**
     * Returns a string containing the account number the account name and the balance.
     *
     * @return A String described above.
     */
    public String toString() {
        return (accountNumber + " - " + accountName + ": " + "£" + openingBalance + "\n");
    }



}
