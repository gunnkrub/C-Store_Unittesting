package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositCashDailyTest {
    @Test
    void deposit_Then_Total_Less_Than_50000_Result_Should_Be_True() {
        boolean expectedResult = true;
        float totalDepositedCashInOneDay = 30000.00f;
        float depositCash = 5000.00f;

        Agent agent = new Agent(new StubBank());

        boolean actualResult = agent.checkDepositInOneDay(depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_Then_Total_Equal_To_50000_Result_Should_Be_True() {
        boolean expectedResult = true;
        float totalDepositedCashInOneDay = 30000.00f;
        float depositCash = 20000.00f;

        Agent agent = new Agent(new StubBank());

        boolean actualResult = agent.checkDepositInOneDay(depositCash);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void deposit_Then_Total_More_Than_50000_Result_Should_Be_False() {
        boolean expectedResult = false;
        float totalDepositedCashInOneDay = 30000.00f;
        float depositCash = 40000.00f;

        Agent agent = new Agent(new StubBank());

        boolean actualResult = agent.checkDepositInOneDay(depositCash);

        assertEquals(expectedResult, actualResult);
    }
}
