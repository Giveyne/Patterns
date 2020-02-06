package Builder;

public class Car {
    protected Integer seats;
    protected Integer engine;
    protected boolean tripComputer;
    protected boolean gps;

    protected void setSeats(Integer seats) {
        this.seats = seats;
    }

    protected void setEngine(Integer engine) {
        this.engine = engine;
    }

    protected void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    protected void setGps(boolean gps) {
        this.gps = gps;
    }

    protected void create() {
        System.out.println("Car create \n " +
                "Your car have:\n " +
                "Count seats: " + seats + "\n " +
                "Engine power: " + engine +
                "\n TripComputer: " + tripComputer +
                "\n GPS: " + gps);
    }
}
