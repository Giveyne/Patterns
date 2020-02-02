package Factory;

public class Main {
    // Паттерн фабрика: 1) создаем класс фабрику > интерфейс фабрики > классы имплементирующие интерфейс >
    // Наполняем фабрику разными методами
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
//
//        Create Cherry Doughnut
//        Create Chocolate Doughnut
//        Create Cream Doughnut
//        Create Chocolate Doughnut
//        I am eat Chocolate Doughnut
//        What a surprise! Create Chocolate Doughnut
//        I am eat Chocolate Doughnut
//        Create Cherry Doughnut
//        I am eat Cherry Doughnut
//        CHERRY
//        CHOCOLATE
//        CREAM