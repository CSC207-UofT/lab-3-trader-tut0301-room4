import org.junit.*;

import static org.junit.Assert.*;

public class SheepTest {
    Sheep s1;
    Sheep s2;
    Sheep s3;

    @Before
    public void setUp() throws Exception {
        s1 = new Sheep("High");
        s2 = new Sheep("Average");
        s3 = new Sheep("Low");
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Baaahhh", s1.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice(){
        int[] prices;
        prices = new int[]{1, 2, 3};
        prices[0] = s1.getPrice();
        prices[1] = s2.getPrice();
        prices[2] = s3.getPrice();
        assertArrayEquals(new int[]{20, 15, 10}, prices);
    }
}
