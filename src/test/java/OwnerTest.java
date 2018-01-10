import org.junit.Before;
import org.junit.Test;
import people.Owner;

import static org.junit.Assert.assertEquals;

    public class OwnerTest {
        private Owner vinceMcMahon;

        @Before
        public void before(){
            vinceMcMahon = new Owner("Vince McMahon", 74, 1, 5_000_000);
        }

        @Test
        public void ownerHasName(){
            assertEquals("Vince McMahon", vinceMcMahon.getName());
        }

        @Test
        public void ownerHasAge(){
            assertEquals(74, vinceMcMahon.getAge());
        }

        @Test
        public void ownerHasEmployeeNumber(){
            assertEquals(1, vinceMcMahon.getEmployeeNumber());
        }

        @Test
        public void ownerHasSalary(){
            assertEquals(5_000_000, vinceMcMahon.getSalary());
        }
    }
