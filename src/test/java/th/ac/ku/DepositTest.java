package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositTest {

    @Test
    void Deposit_Into_Account_More_Than_Daily_Maximum(){
        float expectedBalance = 30000f;
        Agent agent = new Agent(new StubBank());

        float actual = agent.deposit(20000f, "123456789");

        assertEquals(expectedBalance, actual);
    }

}
