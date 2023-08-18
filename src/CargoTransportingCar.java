public class CargoTransportingCar extends CarWithExtendedFeatures {
    public CargoTransportingCar(String brand, String model, String color, String carBody, Integer wheels,
                                String fuelType, String transmissionType, Double engineCapacity) {
        super(brand, model, color, carBody, wheels, fuelType, transmissionType, engineCapacity);
    }

    @Override
    public void move() {

    }

    @Override
    public void service() {

    }

    @Override
    public void shiftGear() {

    }

    @Override
    public void turnOnLights() {

    }

    @Override
    public void turnOnWipers() {

    }

    @Override
    public void turnOnFogLights() {
        System.out.println(brand + " " + model + " fog lights are on.");
    }

    @Override
    public void transportCargo() {
        System.out.println(brand + " " + model + " is transporting cargo.");
    }
}