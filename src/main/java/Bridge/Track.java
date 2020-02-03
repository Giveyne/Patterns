package Bridge;

public class Track extends Venhicle{

    public Track(Model model){
        super(model);
    }
    void drive() {
        model.drive("I drive Track");
    }
}
