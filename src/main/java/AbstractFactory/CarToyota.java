package AbstractFactory;

public class CarToyota implements  CarFactory{
    @Override
    public Sedan createSedan() {
        return new ToyotaSedan();
    }

    @Override
    public Hachback createHachback() {
        return new ToyotaHachback();
    }
}
