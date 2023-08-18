/*
1. Спроектировать абстрактный класс «Car» у которого должны быть свойства: марка,
модель, цвет, тип кузова, число колёс, тип топлива, тип коробки передач, объём
двигателя; методы: движение, обслуживание, переключение передач, включение фар,
включение дворников.
2. Создать конкретный автомобиль путём наследования класса «Car».
3. Расширить абстрактный класс «Car», добавить метод: подметать улицу. Создать
конкретный автомобиль путём наследования класса «Car». Провести проверку принципа
SRP.
4. Расширить абстрактный класс «Car», добавить метод: включение противотуманных фар,
перевозка груза. Провести проверку принципа OCP.
5. Создать конкретный автомобиль путём наследования класса «Car», определить число
колёс = 3. Провести проверку принципа LSP.
6. Создать конкретный автомобиль путём наследования класса «Car», определить метод
«движение» - «полёт». Провести проверку принципа LSP.
7. Создать интерфейс «Заправочная станция», создать метод: заправка топливом.
8. Имплементировать метод интерфейса «Заправочная станция» в конкретный класс «Car».
9. Добавить в интерфейс «Заправочная станция» методы: протирка лобового стекла,
протирка фар, протирка зеркал.
10. Имплементировать все методы интерфейса «Заправочная станция» в конкретный класс
«Car». Провести проверку принципа ISP. Создать дополнительный/е интерфейсы и
имплементировать их в конкретный класс «Car». Провести проверку принципа ISP.
11. Создать путём наследования класса «Car» два автомобиля: с бензиновым и дизельным
двигателями, имплементировать метод «Заправка топливом» интерфейса «Заправочная
станция». Реализовать заправку каждого автомобиля подходящим топливом. Провести
проверку принципа DIP.
 */
public abstract class Car implements FuelStation{
    protected String brand;
    protected String model;
    protected String color;
    protected String carBody;
    protected Integer wheels;
    protected String fuelType;
    protected String transmissionType;
    protected Double engineCapacity;

    public Car(String brand, String model, String color, String carBody, Integer wheels, String fuelType,
               String transmissionType, Double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.carBody = carBody;
        this.wheels = wheels;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.engineCapacity = engineCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public abstract void move();

    public abstract void service();


    public abstract void shiftGear();


    public abstract void turnOnLights();


    public abstract void turnOnWipers();

    public void refuel() {
        System.out.println(brand + " " + model + " is refueling.");
    }

    @Override
    public void cleanWindshield() {
        System.out.println(brand + " " + model + " windshield is being cleaned.");
    }

    @Override
    public void cleanHeadlights() {
        System.out.println(brand + " " + model + " headlights are being cleaned.");
    }

    @Override
    public void cleanMirrors() {
        System.out.println(brand + " " + model + " mirrors are being cleaned.");
    }
}
