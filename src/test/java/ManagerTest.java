import org.junit.Before;
import org.junit.Test;
import people.Manager;
import people.People;
import people.Performer;
import people.Wrestler;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
        private Manager paulHeyman;
        private Wrestler brockLesnar;

    @Before
    public void before(){
        paulHeyman = new Manager("Paul Heyman", 54, 32495, 334000, "Ladies and Gentlemen, my name is Paul Heyman", true);
        brockLesnar = new Wrestler("Brock Lesnar", 40, 9385, 1200000,
                "Brock The Beast Incarnate Lesnar", "Minneapolis, Minnesota", "Heavyweight",
                191, "F5", "Suplex City, B***h", true);
    }

    @Test
    public void managerHasName(){
        assertEquals("Paul Heyman", paulHeyman.getName());
    }

    @Test
    public void managerHasAge(){
        assertEquals(54, paulHeyman.getAge());
    }

    @Test
    public void managerHasEmployeeNumber(){
        assertEquals(32495, paulHeyman.getEmployeeNumber());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(334000, paulHeyman.getSalary());
    }

    @Test
    public void managerHasCatchPhrase(){
        assertEquals("Ladies and Gentlemen, my name is Paul Heyman", paulHeyman.getCatchPhrase());
    }

    @Test
    public void manaagerHasHeelStatus(){
        assertEquals(true, paulHeyman.heelStatus);
    }
}
