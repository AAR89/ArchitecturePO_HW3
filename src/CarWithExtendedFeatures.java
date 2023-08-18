abstract class CarWithExtendedFeatures extends Car {

    public CarWithExtendedFeatures(String brand, String model, String color, String carBody, Integer wheels, String fuelType,
                                   String transmissionType, Double engineCapacity) {
        super(brand, model, color, carBody, wheels, fuelType, transmissionType, engineCapacity);
    }

    public abstract void turnOnFogLights();

    public abstract void transportCargo();
}
