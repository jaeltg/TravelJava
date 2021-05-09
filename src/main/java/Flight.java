import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private LocalTime departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, LocalTime departureTime){
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public int countBookedPassengers() {
        return this.passengers.size();
    }

    public int countAvailableSeats(){
        return this.plane.getPlaneType().getCapacity() - this.countBookedPassengers();
    }

    public void bookPassenger(Passenger passenger, Flight flight){
        if (this.plane.getPlaneType().getCapacity() > this.countBookedPassengers()){
            this.passengers.add(passenger);
            passenger.setFlight(flight);
            int min = 1;
            int max = this.plane.getPlaneType().getCapacity();
            passenger.setSeatNumber( (int) Math.floor(Math.random()*(max-min+1)+min));
        }
    }
    



}
