package Bridge;

abstract class Venhicle {
    Model model;
    public Venhicle(Model model){
        this.model = model;
    }
    abstract void drive();
}
