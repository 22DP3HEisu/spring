package rvt;

public class Money {
    private final int euros;
    private final byte cents;

    public Money(int euros, byte cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public Money(int euros) {
        this(euros, (byte) 0);
    }

    public Money(byte cents) {
        this(0, cents);
    }

    public int euros() {
        return euros;
    }

    public byte cents() {
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

        Money newMoney = new Money(NewEur, (byte) NewCent);

        return newMoney;
    }

    public Money plus(int euros) {
        return this.plus(new Money(euros));
    }
    
    public Money plus(byte cents) {
        return this.plus(new Money(cents));
    }

    public Money minus(Money subtraction) {
        int EurToCents = (euros() - subtraction.euros()) * 100 + (cents() - subtraction.cents());

        int NewEur = EurToCents / 100;
        int NewCent = EurToCents % 100;

        if (EurToCents < 0) {
            NewCent = 0;
            NewEur = 0;
        }

        Money newMoney = new Money(NewEur, (byte) NewCent);

        return newMoney;
    }

    public Money minus(int euros) {
        return this.minus(new Money(euros));
    }

    public Money minus(byte cents) {
        return this.minus(new Money(cents));
    }

    public Boolean lessThan(Money Compare) {
        int Cents = euros() * 100 + cents();
        int CompareCents = Compare.euros() * 100 + Compare.cents();

        return Cents < CompareCents;
    }

    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }

        if (!(compare instanceof Money)) {
            return false;
        }

        Money comparedMoney = (Money) compare;

        if (comparedMoney.euros == this.euros && comparedMoney.cents == this.cents) {
            return true;
        }
        return false;
    }
}
