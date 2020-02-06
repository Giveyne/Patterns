package Builder;

public interface MyBuilder {

    MyBuilder setSeats(Integer seats);
    MyBuilder setEngine(Integer engine);
    MyBuilder setTripComputer(boolean computer);
    MyBuilder setGPS(boolean gps);
    Car build();
    Manual manualBuild();
}
