import org.junit.Assert;
import org.junit.Test;

public class SimulationTest {

    @Test
    public void runSimulationTest() {
        // given
        Simulation sim = new Simulation();


        // when
        sim.runSimulation();

        System.out.println(sim.printResults());
        // then

    }
}
