public class Car {

    private String color;
    private String fuelType;
    private int a;

    public Car(String color, String fuelType) {
        this.color = color;
        this.fuelType = fuelType;
    }

    public Car(String color){
        this.color = color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    protected void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    protected void startEngine(){
        System.out.println("Engine started.");
    }

    protected static void clean(){
        System.out.println("I washed your car.");
    }

    public void drive(){
        startEngine();
        System.out.println("I am driving with speed 50 km/h");
    }

    protected void changeTires(){
        System.out.println("I;m changing tires in Car.");
    }


}
