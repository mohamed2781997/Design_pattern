package Builder;

public class Vehicle {

    private String engin;
    private int wheel;
    private int airbags;

    public String getEngin() {
        return engin;
    }

    public int getWheel() {
        return wheel;
    }

    public int getAirbags() {
        return airbags;
    }

    private Vehicle(VehicleBuilder builder) {
        this.engin = builder.engine;
        this.wheel=builder.wheel;
        this.airbags=builder.airbags;
    }

    public static  class VehicleBuilder {

        private String engine;
        private int wheel;
        private int airbags;

        public VehicleBuilder(String engine, int wheel) {
            this.engine = engine;
            this.wheel = wheel;
        }

        public VehicleBuilder setAirbags(int airbags) {
            this.airbags = airbags;
            return this;
        }
        public Vehicle bulid(){
        return new Vehicle(this);
        }

    }
}

