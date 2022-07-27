import java.util.ArrayList;

public class Bins extends Dice {
    public ArrayList<Integer> bins;
    public Integer min;
    public Integer max;
    Integer numOfTens;


    public Bins(Integer min, Integer max){
        this.min = min;
        this.max = max;

    }

    public void initializeBins() {
        bins = new ArrayList<Integer>();
        for (int i = min; i < max + 1; i++){
            bins.add(0);
        }
    }

    public ArrayList<Integer> getBins(){
        return this.bins;
    }
    public int getBin(int number){
        return bins.get(number - this.min);
    }

    public void incrementBin(Integer number) {
        bins.set(number - this.min, getBin(number) + 1);
    }

    public int size(){
        return bins.size();
    }

    public int digitLength(int number){
        String length = String.valueOf(bins.get(number - this.min));
        return length.length();
    }
}
