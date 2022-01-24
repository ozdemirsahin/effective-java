package builder;

public class Car {
    //required property
    private String brand;
    private String model;

    // non required property
    private boolean seatHeating;
    private boolean cruiseControl;

    public Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
    }

    public static class Builder{
        private Car car;
        //required property
        private String brand;
        private String model;

        // non required property
        private boolean seatHeating;
        private boolean cruiseControl;

        public Builder(String brand, String model) {
            this.brand=brand;
            this.model=model;
        }

        public Car build(){
             return new Car(this);
        }

        public Builder seatHeating(boolean seatHeating){
            this.seatHeating=seatHeating;
            return this;
        }

        public Builder cruiseControl(boolean cruiseControl){
            this.cruiseControl=cruiseControl;
            return this;
        }
    }
}
