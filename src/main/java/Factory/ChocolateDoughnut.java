package Factory;

public class ChocolateDoughnut implements Doughnut{
    public ChocolateDoughnut(){
        System.out.println("Create Chocolate Doughnut");
    }
    public void eat() {
        System.out.println("I am eat Chocolate Doughnut");
    }
}
