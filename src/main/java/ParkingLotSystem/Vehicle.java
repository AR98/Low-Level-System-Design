package ParkingLotSystem;

abstract class Vehicle {
    private final String licenseNumber;

    public Vehicle(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

}
