package Builder;

public class Car {
    public Integer seats;
    public Integer engine;
    public boolean tripComputer;
    public boolean gps;

    public void create() {
        System.out.println("Car create \n " +
                "Your car have:\n " +
                "Count seats: " + seats + "\n " +
                "Engine power: " + engine +
                "\n TripComputer: " + tripComputer +
                "\n GPS: " + gps);
    }
}
