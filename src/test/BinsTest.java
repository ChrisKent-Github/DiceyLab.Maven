import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BinsTest {
    @Test
    public void binsTest_1Die() {
        // given
        Bins bins = new Bins(1, 6);


        // when
        bins.initializeBins();
        System.out.println(bins.getBins().toString());
        // then
        Assert.assertEquals(bins.size(),6);
    }

    @Test
    public void binsTest_2Dice() {
        // given
        Bins bins = new Bins(2, 12);


        // when
        bins.initializeBins();
        System.out.println(bins.getBins().toString());
        // then
        Assert.assertEquals(bins.size(),11);
    }

    @Test
    public void binsTest_3Dice() {
        // given
        Bins bins = new Bins(3, 18);


        // when
        bins.initializeBins();
        System.out.println(bins.getBins().toString());
        // then
        Assert.assertEquals(bins.size(),16);
    }

    @Test
    public void binsTest_4Dice() {
        // given
        Bins bins = new Bins(4, 24);


        // when
        bins.initializeBins();
        System.out.println(bins.getBins().toString());
        // then
        Assert.assertEquals(bins.size(),21);
    }

    @Test
    public void binsTest_Increment_1Die() {
        // given
        Bins bins = new Bins(1, 6);


        // when
        bins.initializeBins();
        bins.incrementBin(4);
        System.out.println(bins.getBins().toString());
        // then
        Assert.assertEquals(1, bins.getBin(4));
    }

    @Test
    public void binsTest_Increment_2Dice() {
        // given
        Bins bins = new Bins(2, 12);


        // when
        bins.initializeBins();
        bins.incrementBin(4);
        System.out.println(bins.getBins().toString());
        // then
        Assert.assertEquals(1,bins.getBin(4));
    }

    @Test
    public void binsTest_Increment_3Dice() {
        // given
        Bins bins = new Bins(3, 18);


        // when
        bins.initializeBins();
        bins.incrementBin(4);
        System.out.println(bins.getBins().toString());
        // then
        Assert.assertEquals(1,bins.getBin(4));
    }

    @Test
    public void binsTest_Increment_4Dice() {
        // given
        Bins bins = new Bins(4, 24);


        // when
        bins.initializeBins();
        bins.incrementBin(4);
        System.out.println(bins.getBins().toString());
        // then
        Assert.assertEquals(1,bins.getBin(4));
    }
}
