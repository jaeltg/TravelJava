public enum PlaneType {
    BOEING747(410, 448.0),
    BOEING737(5, 70.1),
    A380(544, 575.0),
    A350(325, 280.0),
    BOEING787(330, 250.8);

    private int capacity;
    private double weight;

    PlaneType(int capacity, double weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
