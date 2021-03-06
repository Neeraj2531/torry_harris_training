package collectiontask.model;

public class Car implements Comparable<Car>{
    private int chassisNo;
    private String carName,fuelType;
    private Float power;

    public Car(int chassisNo, String carName, String fuelType, Float power) {
        this.chassisNo = chassisNo;
        this.carName = carName;
        this.fuelType = fuelType;
        this.power = power;
    }

    public int getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(int chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Float getPower() {
        return power;
    }

    public void setPower(Float power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "chassisNo=" + chassisNo +
                ", carName='" + carName + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.power.compareTo(o.power);
    }
}
