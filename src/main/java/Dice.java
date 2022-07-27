
    public class Dice {
    Integer numOfDice;
    Integer maxRoll;



    public Dice(){
        this.numOfDice = 1;
        this.maxRoll = 6;
        }


    public Dice(Integer numOfDice){
    this.numOfDice = numOfDice;
    this.maxRoll = numOfDice * 6;
    }

    public Integer tossAndSum(){
    int result = 0;
    for (int i = 0; i < numOfDice; i++) {
        result += (6 * Math.random() + 1);
    }
    return result;
    }


}
