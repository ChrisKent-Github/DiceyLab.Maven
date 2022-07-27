import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    @Test
    public void diceTest_1Die() {
        // given
        Integer numOfDice = 1;
        Dice dice = new Dice(numOfDice);

        // when
        Integer result = dice.tossAndSum();

        // then
        Assert.assertTrue(result >= (result * 1) && result <= (result * 6));
    }

    @Test
    public void diceTest_2Dice() {
        // given
        Integer numOfDice = 2;
        Dice dice = new Dice(numOfDice);

        // when
        Integer result = dice.tossAndSum();

        // then
        Assert.assertTrue(result >= (result * 1) && result <= (result * 6));
    }

    @Test
    public void diceTest_3Dice() {
        // given
        Integer numOfDice = 3;
        Dice dice = new Dice(numOfDice);

        // when
        Integer result = dice.tossAndSum();

        // then
        Assert.assertTrue(result >= (result * 1) && result <= (result * 6));
    }

    @Test
    public void diceTest_4Dice() {
        // given
        Integer numOfDice = 4;
        Dice dice = new Dice(numOfDice);

        // when
        Integer result = dice.tossAndSum();

        // then
        Assert.assertTrue(result >= (result * 1) && result <= (result * 6));
    }

    @Test
    public void diceTest_5Dice() {
        // given
        Integer numOfDice = 5;
        Dice dice = new Dice(numOfDice);

        // when
        Integer result = dice.tossAndSum();

        // then
        Assert.assertTrue(result >= (result * 1) && result <= (result * 6));
    }
}
