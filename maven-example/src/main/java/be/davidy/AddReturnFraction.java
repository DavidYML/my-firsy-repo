package be.davidy;

import com.realdolmen.Utilities;

/**
 * Created by jonsnow on 23/06/16.
 */
public class AddReturnFraction {
    public int numerator;
    public int denumerator;

    public AddReturnFraction (int numerator, int denumerator) {
        this.numerator = numerator;
        this.denumerator = denumerator;

        int deler = Utilities.greatestCommonFactor(numerator, denumerator);

        this.numerator = numerator / deler;
        this.denumerator = denumerator / deler;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenumerator() {
        return denumerator;
    }

    public void setDenumerator(int denumerator) {
        this.denumerator = denumerator;
    }
}
