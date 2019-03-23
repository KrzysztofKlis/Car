public class Ferrari extends Car{

 //Constructors should have the same parameters than parent class
    public Ferrari(String color, String fuelType){
        super(color, fuelType);
    }

    public Ferrari(String color){
        super(color);
    }

    @Override
    public void drive() {
        setFuelType("gasoline");
        startEngine();
        System.out.println("I am driving with speed 120 km/h");
        super.drive();
    }

    @Override
    protected void changeTires() {
        System.out.println("I'm changing tires in Ferrari.");
    }
}
