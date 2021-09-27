import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MuleTest {

    Mule m;

    @Before void setUp() throws Exception {
        m = new Mule();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Kihkihkih", m.sound());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(5, m.getPrice());
    }
}
