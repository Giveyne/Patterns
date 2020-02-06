package Builder;

public class Manual {
    public Integer seats;
    public Integer engine;
    public boolean tripComputer;
    public boolean gps;
    public void create(){
        System.out.println("This Manual you car \n " +
                "You have:\n Count seats: " + seats + "\n " +
                "Engine power: " + engine +
                "\n tripComputer: " + tripComputer +
                "\n GPS: " + gps);
    }
}
