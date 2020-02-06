package Builder;

public class CarManualBuilder implements MyBuilder {
    Manual manual = new Manual();

    @Override
    public MyBuilder setSeats(Integer seats) {
        manual.seats = seats;
        return this;
    }
    @Override
    public MyBuilder setEngine(Integer engine) {
        manual.engine = engine;
        return this;
    }
    @Override
    public MyBuilder setTripComputer(boolean tripComputer) {
        manual.tripComputer = tripComputer;
        return this;
    }
    @Override
    public MyBuilder setGPS(boolean gps) {
        manual.gps = gps;
        return this;
    }
    @Override
    public Car build() {
        return null;
    }

    @Override
    public Manual manualBuild() {
        return manual;
    }

}