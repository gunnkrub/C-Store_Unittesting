package th.ac.ku;

public interface Bank {
    boolean isValidAccount(String accountID);

    float getUserDailyDeposit();

    float deposit(float cash);
}
