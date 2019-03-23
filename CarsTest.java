public class CarsTest {

    public static void main(String[] args) {
        Car car = new Car("red", "gasoline");
        Ferrari ferrari = new Ferrari("black", "rocket fuel");
        Scania scania = new Scania("white", "diesel");

        car.changeTires();
        ferrari.changeTires();
        scania.changeTires();

        Car carFerrari = new Ferrari("red", "rocket fuel");
        Car carScania = new Scania("black", "addBlue");
//  This methods belongs to the runtime execution, so they came from instance, not form object type
        carFerrari.changeTires();
        carScania.changeTires();

     //   Ferrari ferrariScania = new Scania("black", "addBlue");
        // Ferrari is not the Scania
    }
}
