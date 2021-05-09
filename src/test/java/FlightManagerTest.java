import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Plane plane;

    @Before
    public void setUp(){
        flightManager = new FlightManager("Kevin");
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canCalculateBaggageWeight(){
        assertEquals(32, flightManager.calculateBaggageWeightPerPassenger(plane));
    }
}
