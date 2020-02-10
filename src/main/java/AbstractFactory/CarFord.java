package AbstractFactory;

public class CarFord implements CarFactory{
    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }

    @Override
    public Hachback createHachback() {
        return new FordHatchback();
    }
}
