package th.ac.ku;

public class Agent {
    Bank bank;
    public Agent(){
        // add real bank here
    }
    public Agent(Bank bank){
        this.bank= bank;
    }
    public boolean checkDepositPerTransaction(float depositCash) {
        float depositCashLimit = 30000.00f;
        return depositCash <= depositCashLimit;
    }

    public boolean checkDepositInOneDay(float depositCash, float totalDepositedCashInOneDay) {
        float depositCashDailyLimit = 50000.00f;
        return depositCash + totalDepositedCashInOneDay <= depositCashDailyLimit;
    }

    public boolean isValidAccount(String accountID) {
        return bank.isValidAccount(accountID);
    }

    public boolean isDepositMoreThanMinimum(float depositCash) {
        float minimumDepositCash = 100.00f;
        if (depositCash < minimumDepositCash) {
            return false;
        }
        else {
            return true;
        }
    }

    public boolean checkDepositInOneDay(float depositCash) {

        float totalDepositedCashInOneDay = bank.getUserDailyDeposit();
        if (depositCash+ totalDepositedCashInOneDay > 50000f){
            return false;
        }
        return true;
    }

    public float deposit(float cash, String accountId) {

        if (!checkDepositPerTransaction(cash) && !checkDepositInOneDay(cash) && !(isValidAccount(accountId)))
            return 0;

        float balance = bank.deposit(cash);

        return balance;
    }
}

