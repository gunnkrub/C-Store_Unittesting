package th.ac.ku;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckValidAccountTest {
    @Test
    void is_Valid_Account_Should_Return_True() {
        boolean expectedResult = true;
        String validAccountID = "123456789";

        Agent agent = new Agent();

        boolean actualResult = agent.isValidAccount(validAccountID);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void is_Suspended_Account_Should_Return_False() {
        boolean expectedResult = false;
        String suspendedAccountID = "234567891";

        Agent agent = new Agent();

        boolean actualResult = agent.isValidAccount(suspendedAccountID);

        assertEquals(expectedResult, actualResult);
    }
}