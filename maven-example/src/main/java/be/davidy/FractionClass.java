package be.davidy;

import com.realdolmen.Utilities;

/**
 * Created by jonsnow on 23/06/16.
 */
public class FractionClass {
    private int numerator;
    private int denumerator;

    public FractionClass(int numerator, int denumerator) {

        this.numerator = numerator;
        this.denumerator = denumerator;

       int deler= Utilities.greatestCommonFactor(numerator,denumerator);

        this.numerator=numerator/deler;
        this.denumerator=denumerator/deler;


    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenumerator() {
        return denumerator;
    }

    @Override
    public String toString() {
        return numerator+"/"+denumerator;
    }

    public FractionClass add (FractionClass that){
        int tempNumerator = this.numerator*that.denumerator + this.denumerator*that.numerator;

        int tempDenomitor = this.denumerator*that.denumerator;

        FractionClass h = new FractionClass(tempNumerator,tempDenomitor);
        return h;
    }

}



