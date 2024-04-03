package richestCustomerWealth;

import org.junit.Test;
import static org.junit.Assert.*;

public class richestCustomerWealthTest {
    @Test
    public void testrichestCustomerWealthTest() throws Exception {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int result = 6;
        richestCustomerWealth rc = new richestCustomerWealth();
        int ans = rc.maximumWealth(accounts);
        System.out.println(ans);
        assertEquals(result, ans);
    }
}
