import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightTest {

    private Plane plane;
    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;
    private Passenger passenger6;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "FR756", "Tokyo", "Edinburgh", LocalTime.of(15,45));
        passenger1 = new Passenger("Gabriela", 2);
        passenger2 = new Passenger("Ronald", 1);
        passenger3 = new Passenger("John", 3);
        passenger4 = new Passenger("Michael", 1);
        passenger5 = new Passenger("Amber", 1);
        passenger6 = new Passenger("Tom", 2);
        }

    @Test
    public void passengersStartsEmpty(){
        assertEquals(0, flight.countBookedPassengers());
    }

    @Test
    public void hasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("Tokyo", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("Edinburgh", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals(LocalTime.of(15,45), flight.getDepartureTime());
    }

    @Test
    public void canReturnNumberOfAvailableSeats(){
        flight.bookPassenger(passenger1, flight);
        flight.bookPassenger(passenger2, flight);
        flight.bookPassenger(passenger3, flight);
        flight.bookPassenger(passenger4, flight);
        assertEquals(406, flight.countAvailableSeats());
    }

    @Test
    public void canBookPassengersIfCapacity() {
        flight.bookPassenger(passenger1, flight);
        flight.bookPassenger(passenger2, flight);
        flight.bookPassenger(passenger3, flight);
        flight.bookPassenger(passenger4, flight);
        assertEquals(4, flight.countBookedPassengers());
        assertEquals(flight, passenger1.getFlight());
        assertTrue(passenger2.getSeatNumber() > 0);
    }

    @Test
    public void cannotBookPassengersIfNoCapacity() {
        Plane plane = new Plane(PlaneType.BOEING737);
        Flight flight = new Flight(plane, "ED233", "Glasgow", "Edinburgh", LocalTime.of(12,0));
        flight.bookPassenger(passenger1, flight);
        flight.bookPassenger(passenger2, flight);
        flight.bookPassenger(passenger3, flight);
        flight.bookPassenger(passenger4, flight);
        flight.bookPassenger(passenger5, flight);
        flight.bookPassenger(passenger6, flight);
        assertEquals(5, flight.countBookedPassengers());
        assertTrue(passenger2.getSeatNumber() > 0);
    }
}
