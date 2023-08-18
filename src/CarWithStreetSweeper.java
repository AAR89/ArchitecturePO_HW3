abstract class CarWithStreetSweeper extends Car {

    public CarWithStreetSweeper(String brand, String model, String color, String carBody, Integer wheels, String fuelType,
                                String transmissionType, Double engineCapacity) {
        super(brand, model, color, carBody, wheels, fuelType, transmissionType, engineCapacity);
    }

    public abstract void sweepStreet();
}

