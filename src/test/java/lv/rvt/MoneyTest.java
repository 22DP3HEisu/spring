package lv.rvt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import rvt.Money;;

public class MoneyTest {
    @Test
    // public void testPlusMethod() {
    //     Money mon1 = new Money(1, 85);
    //     Money mon2 = new Money(2, 90);

    //     Money result1 = mon1.plus(mon2);

    //     assertEquals(4, result1.euros());
    //     assertEquals(75, result1.cents());
    // }

    public void lessThan() {
        Money mon1 = new Money(1, 85);
        Money mon2 = new Money(2, 90);

        Boolean result1 = mon1.lessThan(mon2);

        assertEquals(true, result1);
    }
}
