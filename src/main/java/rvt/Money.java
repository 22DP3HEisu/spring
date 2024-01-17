package rvt;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents < 10 && cents > -10) {
            zero = "0";
        }

        return euros + "." + zero + cents + " EUR";
    }

    public Money plus(Money addition) {
        int EurToCents = (euros() + addition.euros()) * 100 + (cents() + addition.cents());

        int NewEur = EurToCents / 100;
        int NewCent = EurToCents % 100;

        if (NewEur < 0) {
            NewCent = Math.abs(NewCent);
        }

        Money newMoney = new Money(NewEur, NewCent);

        return newMoney;
    }

    public Money minus(Money subtraction) {
        int EurToCents = (euros() - subtraction.euros()) * 100 + (cents() - subtraction.cents());

        int NewEur = EurToCents / 100;
        int NewCent = EurToCents % 100;

        if (EurToCents < 0) {
            NewCent = 0;
            NewEur = 0;
        }

        Money newMoney = new Money(NewEur, NewCent);

        return newMoney;
    }

    public Boolean lessThan(Money Compare) {
        int Cents = euros() * 100 + cents();
        int CompareCents = Compare.euros() * 100 + Compare.cents();

        return Cents < CompareCents;
    }
}
