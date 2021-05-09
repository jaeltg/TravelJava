import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(410, plane.getPlaneType().getCapacity());
    }

    @Test
    public void hasWeight(){
        assertEquals(448.0, plane.getPlaneType().getWeight(), 0.01);
    }
}
