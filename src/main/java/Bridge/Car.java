package Bridge;

public class Car extends Venhicle{
    public Car(Model model){
        super(model);
    }
    void drive() {
        model.drive("I drive car");
    }
}
