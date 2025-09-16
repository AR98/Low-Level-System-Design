package ParkingLotSystem;

abstract class ParkingSpot {
    private  final int id;
    private  boolean isFree;
    private  Vehicle vehicle;

    public ParkingSpot(int id) {
        this.id = id;
        this.isFree = true;
        this.vehicle = null;
    }

    public int getId() {
        return id;
    }

    public boolean isFree() {
        return isFree;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isFree = false;
    }

    public void releaseVehicle() {
        this.vehicle = null;
        this.isFree = true;
    }

}
