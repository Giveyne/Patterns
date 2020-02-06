package Builder;

public class Manual {
    protected Integer seats;
    protected Integer engine;
    protected boolean tripComputer;
    protected boolean gps;
    protected void create(){
        System.out.println("This Manual you car \n " +
                "You have:\n Count seats: " + seats + "\n " +
                "Engine power: " + engine +
                "\n tripComputer: " + tripComputer +
                "\n GPS: " + gps);
    }
}
