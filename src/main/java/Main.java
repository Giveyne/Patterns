import Factory.Doughnut;
import Factory.DoughnutTypes;
import Factory.DoughnutsFactory;
// Паттерн фабрика: 1) создаем класс фабрику > интерфейс фабрики > классы имплементирующие интерфейс >
// Наполняем фабрику разными методами
public class Main {
    public static void main(String[] args) {
        DoughnutsFactory factory = new DoughnutsFactory();
        factory.getDoughnut(DoughnutTypes.CHERRY);
        factory.getDoughnut(DoughnutTypes.CHOCOLATE);
        factory.getDoughnut(DoughnutTypes.CREAM);
        DoughnutsFactory.getRandomDoughnut(factory).eat();
        DoughnutsFactory.eatRandomDoughnut(factory);
        Doughnut cherry = factory.getDoughnut(DoughnutTypes.CHERRY);
        cherry.eat();
        factory.getAllElementFactory();
    }
}
//        Create Cherry Doughnut
//        Create Chocolate Doughnut
//        Create Cream Doughnut
//        Create Cherry Doughnut
//        I eat Cherry Doughnut
//        What a surprise! Create Cherry Doughnut
//        I eat Cherry Doughnut
//        Create Cherry Doughnut
//        I eat Cherry Doughnut
//        CHERRY
//        CHOCOLATE
//        CREAM