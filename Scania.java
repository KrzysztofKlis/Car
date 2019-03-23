public class Scania extends Car {
    public Scania(String color, String fuelType) {
        super(color, fuelType);
    }

    public Scania(String color) {
        super(color);
    }

    @Override
    protected void setFuelType(String fuelType) {
        super.setFuelType(fuelType);
    }

    @Override
    protected void startEngine() {
        super.startEngine();
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    protected void changeTires() {
        System.out.println("I'm changing tires in Scania.");
    }
}
