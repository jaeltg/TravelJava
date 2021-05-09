public class FlightManager {

    private String name;

    public FlightManager(String name){
        this.name = name;
    }

    public int calculateBaggageWeightPerPassenger(Plane plane){
        return plane.getBaggageAllowance() / plane.getPlaneType().getCapacity();
    }



}
