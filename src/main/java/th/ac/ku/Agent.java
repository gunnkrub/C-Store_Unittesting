package th.ac.ku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Agent {
    public boolean checkDepositPerTransaction(float depositCash) {
        float depositCashLimit = 30000.00f;
        if (depositCash < depositCashLimit) {
            return true;
        }
        if (depositCash == depositCashLimit) {
            return true;
        }
        else{
            return false;
        }

    }

    public boolean checkDepositInOneDay(float depositCash, float totalDepositedCashInOneDay) {
        float depositCashDailyLimit = 50000.00f;
        if (depositCash + totalDepositedCashInOneDay <= depositCashDailyLimit) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isValidAccount(String accountID) {
        boolean isValidAccount = true;
        try {
            File fileObject = new File("src/main/resources/suspended_accounts.txt");
            Scanner myReader = new Scanner(fileObject);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (accountID.equals(data)) {
                    isValidAccount = false;
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return isValidAccount;
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
}

