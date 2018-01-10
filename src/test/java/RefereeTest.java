import org.junit.Before;
import org.junit.Test;
import people.Referee;

import static org.junit.Assert.assertEquals;

public class RefereeTest {
    private Referee earlHebner;

    @Before
    public void before(){
        earlHebner = new Referee("Earl Hebner", 54, 1238, 100_000);
    }

    @Test
    public void refHasName(){
        assertEquals("Earl Hebner", earlHebner.getName());
    }

    @Test
    public void refHasAge(){
        assertEquals(54, earlHebner.getAge());
    }

    @Test
    public void refHasEmployeeNumber(){
        assertEquals(1238, earlHebner.getEmployeeNumber());
    }

    @Test
    public void refHasSalary(){
        assertEquals(100_000, earlHebner.getSalary());
    }

    @Test
    public void refDoesThreeCount(){
        assertEquals("One, two, three!!", earlHebner.threeCount());
    }

    @Test
    public void refDoesTenCount(){
        assertEquals("One, two, three, four, five, six, seven, eight, nine, ten!", earlHebner.countOut());
    }



}
