package th.ac.ku;

public class StubBank implements Bank {
    float dailyTotal = 30000f;
    @Override
    public boolean isValidAccount(String accountID) {
        if(accountID == "123456789"){
            return true;
        }
        return false;
    }

    @Override
    public float getUserDailyDeposit() {
        return 30000f;
    }

    @Override
    public float deposit(float cash) {
        return 30000f;
    }
}
