import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CamelTest {

    Camel c;

    @Before
    public void setUp() throws Exception {
        c = new Camel();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Eeeeghh!", c.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(2, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        c.downgradeSpeed();
        assertEquals(0, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(30, c.getPrice());
    }

}
