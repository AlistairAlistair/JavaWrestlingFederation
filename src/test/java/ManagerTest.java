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
        private Wrestler cmPunk;

    @Before
    public void before(){
        paulHeyman = new Manager("Paul Heyman", 54, 32495, 334_000, "Ladies and Gentlemen, my name is Paul Heyman", true);
        brockLesnar = new Wrestler("Brock Lesnar", 40, 9385, 1_200_000,
                "Brock The Beast Incarnate Lesnar", "Minneapolis, Minnesota", "Heavyweight",
                191, "F5", "Suplex City, B***h", true);
        cmPunk = new Wrestler("Phil Brooks", 39, 2434, 1100000,
                "CM Punk", "Chicago, Illinois", "Heavyweight",
                188, "Go To Sleep", "I'm straight Edge, and that means I'm better than you", false);
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
    public void managerHasHeelStatus(){
        assertEquals(true, paulHeyman.getHeelStatus());
    }

    @Test
    public void managerHasEmptyStable(){
        assertEquals(0, paulHeyman.numberOfWrestlers());
    }

    @Test
    public void managerHasOneWrestlerInSTable(){
        paulHeyman.addWrestlerToStable(brockLesnar);
        assertEquals(1, paulHeyman.numberOfWrestlers());
    }

    @Test
    public void removeWrestlerFromStable(){
        paulHeyman.addWrestlerToStable(brockLesnar);
        paulHeyman.removeWrestlerFromStable(brockLesnar);
        assertEquals(0, paulHeyman.numberOfWrestlers());

    }

    @Test
    public void managerHasTwoWrestlersInStable(){
        paulHeyman.addWrestlerToStable(cmPunk);
        paulHeyman.addWrestlerToStable(brockLesnar);
        assertEquals(2, paulHeyman.numberOfWrestlers());
    }

    @Test
    public void doesWrestlerHeelStatusChangeAdded(){
        paulHeyman.addWrestlerToStableChangeStatus(cmPunk);
        assertEquals(true, cmPunk.getHeelStatus());
        assertEquals(1, paulHeyman.numberOfWrestlers());
    }

    @Test
    public void doesWrestlerHeelStatusChangeRemoved(){
        paulHeyman.removeWrestlerFromStableChangeStatus(brockLesnar);
        assertEquals(false, brockLesnar.getHeelStatus());
        assertEquals(0, paulHeyman.numberOfWrestlers());
    }
}
