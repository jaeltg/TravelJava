public class Plane {

    private PlaneType planeType;
    private int baggageAllowance;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
        this.baggageAllowance = (planeType.getCapacity() * 50);
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getBaggageAllowance() {
        return baggageAllowance;
    }

}
