import java.text.DecimalFormat;

public class Simulation {
Bins result;
Integer min;
Integer max;



    public Bins runSimulation(){
        Dice dice = new Dice(4);
        Bins bins = new Bins(4, 24);
        this.min = bins.min;
        this.max = bins.max;
        bins.initializeBins();
        for (int i = 0; i <= 1000000; i++) {
             bins.incrementBin(dice.tossAndSum());
        }
        this.result = bins;
        return bins;
    }

    public String printResults(){
        String stringResult = "";
        String spaces = "";
        Double percent = 0.00;
        String bar = "";
        DecimalFormat df = new DecimalFormat();
        Double total = 0.00;
        Integer totalCap = this.result.size();

        for (int i = this.min; i < totalCap; i++) {
             total += this.result.getBin(i);
        }

        for (int i = this.min; i < this.result.size() + this.min; i++) {

            for (int j = 0; j < 9 - this.result.digitLength(i); j++) {
                spaces += " ";
            }

            percent = Double.valueOf(df.format((this.result.getBin(i)/total)));

            for (int k = 0; k < Math.ceil(percent * 100); k++) {
                bar += "*";
            }

             stringResult += i + ":" + spaces + this.result.getBin(i) + ": " + percent + bar + "\n";
            spaces = "";
            bar = "";
        }
        return stringResult;
    }

}
