package Factory;

public class CreamDoughnut implements Doughnut{
    public CreamDoughnut(){
        System.out.println("Create Cream Doughnut");
    }
    public void eat() {
        System.out.println("I am eat Cream Doughnut");
    }
}
