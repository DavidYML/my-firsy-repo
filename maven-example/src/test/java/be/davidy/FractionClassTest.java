package be.davidy;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jonsnow on 23/06/16.
 */
public class FractionClassTest {
    @Test
    public void simplificationIsDone() throws Exception {
        FractionClass f = new FractionClass(10, 20);

        Assert.assertEquals(1, f.getNumerator());
        Assert.assertEquals(2, f.getDenumerator());

    }


    @Test
    public void toStringGivesCorrect () throws Exception {

         FractionClass g = new FractionClass(2, 3);

         String s = g.toString();

        Assert.assertEquals("2/3",s);


}
    @Test
    public void addingTwoFractionsReturnsSum () throws Exception {

      FractionClass a  = new FractionClass (5,1);

      FractionClass b = new  FractionClass(2,8) ;

      FractionClass c = a.add(b);

        Assert.assertEquals(21,c.getNumerator());
        Assert.assertEquals(4,c.getDenumerator());
    }

    }



