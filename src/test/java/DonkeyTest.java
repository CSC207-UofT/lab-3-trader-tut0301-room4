import org.junit.*;

import static org.junit.Assert.*;

public class DonkeyTest {
    Donkey d;

    @Before
    public void setUp() throws Exception {
        d = new Donkey();
    }
    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Eo Eo", d.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(12, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        d.upgradeSpeed();
        assertEquals(13, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(8, d.getPrice());
    }
}
