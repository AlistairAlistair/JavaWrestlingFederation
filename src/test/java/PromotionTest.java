import Promotions.Promotion;
import org.junit.Before;
import org.junit.Test;
import people.Manager;
import people.Owner;
import people.Referee;
import people.Wrestler;

import static org.junit.Assert.assertEquals;

public class PromotionTest {
    private Promotion wwe;
    private Manager paulHeyman;
    private Wrestler brockLesnar;
    private Wrestler cmPunk;
    private Referee earlHebner;
    private Owner vinceMcMahon;

    @Before
    public void before(){
        wwe = new Promotion("WWE", "Stamford");
        paulHeyman = new Manager("Paul Heyman", 54, 32495, 334_000, "Ladies and Gentlemen, my name is Paul Heyman", true);
        brockLesnar = new Wrestler("Brock Lesnar", 40, 9385, 1_200_000,
                "Brock The Beast Incarnate Lesnar", "Minneapolis, Minnesota", "Heavyweight",
                191, "F5", "Suplex City, B***h", true);
        cmPunk = new Wrestler("Phil Brooks", 39, 2434, 1100000,
                "CM Punk", "Chicago, Illinois", "Heavyweight",
                188, "Go To Sleep", "I'm straight Edge, and that means I'm better than you", false);
        earlHebner = new Referee("Earl Hebner", 54, 1238, 100_000);
        vinceMcMahon = new Owner("Vince McMahon", 74, 1, 5_000_000);

    }

    @Test
    public vo

    @Test
    public void promotionHasNoEmployees(){
        assertEquals(0, wwe.numberOfEmployees());
    }

    @Test
    public void promotionHasOneEmployee(){
        wwe.addEmployeeToPromotion(brockLesnar);
        assertEquals(1, wwe.numberOfEmployees());
    }

    @Test
    public void promotionHasFourEmployees(){
        wwe.addEmployeeToPromotion(brockLesnar);
        wwe.addEmployeeToPromotion(cmPunk);
        wwe.addEmployeeToPromotion(earlHebner);
        wwe.addEmployeeToPromotion(vinceMcMahon);
        assertEquals(4, wwe.numberOfEmployees());
    }




}
