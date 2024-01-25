package lv.rvt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import rvt.Money;

public class MoneyTest {
    @Test
    public void testPlusMoney() {
        Money mon1 = new Money(1, (byte) 85);
        Money mon2 = new Money(2, (byte) 90);

        Money result1 = mon1.plus(mon2);

        assertEquals(4, result1.euros());
        assertEquals(75, result1.cents());
    }

    @Test
    public void testPlusCents() {
        Money mon1 = new Money(1);

        Money result1 = mon1.plus((byte) 90);

        assertEquals(1, result1.euros());
        assertEquals(90, result1.cents());
    }

    @Test
    public void testPlusEuros() {
        Money mon1 = new Money((byte) 90);

        Money result1 = mon1.plus(1);

        assertEquals(1, result1.euros());
        assertEquals(90, result1.cents());
    }

    @Test
    public void testMinusMoney() {
        Money mon1 = new Money(1, (byte) 85);
        Money mon2 = new Money(2, (byte) 90);

        Money result1 = mon2.minus(mon1);

        assertEquals(1, result1.euros());
        assertEquals(5, result1.cents());
    }

    @Test
    public void testMinusCents() {
        Money mon1 = new Money(1);

        Money result1 = mon1.minus((byte) 95);

        assertEquals(0, result1.euros());
        assertEquals(5, result1.cents());
    }

    @Test
    public void testMinusEuros() {
        Money mon1 = new Money((byte) 101);

        Money result1 = mon1.minus(1);

        assertEquals(0, result1.euros());
        assertEquals(1, result1.cents());
    }

    @Test
    public void lessThan() {
        Money mon1 = new Money(1, (byte) 85);
        Money mon2 = new Money(2, (byte) 90);

        Boolean result1 = mon1.lessThan(mon2);

        assertEquals(true, result1);
    }

    @Test
    public void isMoneyEqual() {
        Money mon1 = new Money(5, (byte) 50);
        Money mon2 = new Money(5, (byte) 50);

        assertEquals(mon1, mon2);
    }
}
