package builder;

public class Test {

    public static void main(String[] args) {
        Car car= new Car.Builder("Mercedes", "E200").cruiseControl(true).seatHeating(true).build();
    }
}
