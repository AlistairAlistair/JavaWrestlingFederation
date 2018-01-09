import org.junit.Before;
import org.junit.Test;
import people.Wrestler;

import static org.junit.Assert.assertEquals;

public class WrestlerTest {
    private Wrestler jakeRoberts;

    @Before
    public void before(){
        jakeRoberts = new Wrestler("Jake Roberts", 35, 2384, 300000,
                "Jake The Snake Roberts", "Stone Mountain, Georgia.", 195,
                260, "DDT", "Trust Me", true);
    }

    @Test
    public void wrestlerHasAName(){
        assertEquals("Jake Roberts", jakeRoberts.getName());
    }

    @Test
    public void wrestlerHasAnAge(){
        assertEquals(35, jakeRoberts.getAge());
    }

    @Test
    public void wrestlerHasAnEmployeeNumber(){
        assertEquals(2384, jakeRoberts.getEmployeeNumber());
    }

    @Test
    public void wrestlerHasASalary(){
        assertEquals(300000, jakeRoberts.getSalary());
    }

    @Test
    public void wrestlerHasAnAlias(){
        assertEquals("Jake The Snake Roberts", jakeRoberts.getAlias());
    }

    @Test
    public void wrestlerHasAHomeTown(){
        assertEquals("Stone Mountain, Georgia.", jakeRoberts.getHomeTown());
    }

    @Test
    public void wrestlerHasWeightClass(){
        assertEquals(195, jakeRoberts.getWeightClass());
    }

    @Test
    public void wrestlerHasHeight(){
        assertEquals(260, jakeRoberts.getHeight());
    }

    @Test
    public void wrestlerHasFinishingMove(){
        assertEquals("DDT", jakeRoberts.getFinishingMove());
    }

    @Test
    public void wrestlerHasCatchPhrase(){
        assertEquals("Trust Me", jakeRoberts.getCatchPhrase());
    }

    @Test
    public void wrestlerHasHeelStatus(){
        assertEquals(true, jakeRoberts.getHeelStatus());
    }
}
