import org.junit.Before;
import org.junit.Test;
import people.Wrestler;
import people.WrestlingFan;

import static org.junit.Assert.assertEquals;

public class WrestlingFanTest {
    private WrestlingFan billyCenaFan;

    @Before
    public void before(){
        billyCenaFan = new WrestlingFan("Billy Fan", 8, 30, true, "John Cena");
    }

    @Test
    public void wrestlingFanHasAName(){
        assertEquals("Billy Fan", billyCenaFan.getName());
    }

    @Test
    public void wrestlingFanHasAnAge(){
        assertEquals(8, billyCenaFan.getAge());
    }

    @Test
    public void wrestlingFanHasMoney(){
        assertEquals(30, billyCenaFan.getCashMoney());
    }

    @Test
    public void wrestlingFanHasFavWrestler(){
        assertEquals("John Cena", billyCenaFan.getFavouriteWrestler());
    }
}
