public class StreetSweeperCar extends CarWithStreetSweeper {
    public StreetSweeperCar(String brand, String model, String color, String carBody, Integer wheels,
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
    public void sweepStreet() {
        System.out.println(brand + " " + model + " is sweeping the street.");

    }
}
