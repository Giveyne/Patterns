package Builder;


public class CarBuilder implements MyBuilder {
    Car car = new Car();

    @Override
    public MyBuilder setSeats(Integer seats) {
        car.seats = seats;
        return this;
    }
    @Override
    public MyBuilder setEngine(Integer engine) {
        car.engine = engine;
        return this;
    }
    @Override
    public MyBuilder setTripComputer(boolean tripComputer) {
        car.tripComputer = tripComputer;
        return this;
    }
    @Override
    public MyBuilder setGPS(boolean gps) {
        car.gps = gps;
        return this;
    }
    @Override
    public Car build(){
        return car;
    }

    @Override
    public Manual manualBuild() {
        return null;
    }
}
