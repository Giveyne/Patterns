package Factory;
import java.util.Random;
public class DoughnutsFactory {

    public Doughnut getDoughnut (DoughnutTypes type){
        Doughnut toReturn = null;
        switch (type) {
            case CHERRY: toReturn = new CherryDoughnut();
                            break;
            case CREAM: toReturn = new CreamDoughnut();
                            break;
            case CHOCOLATE: toReturn = new ChocolateDoughnut();
                            break;
            default: throw new IllegalArgumentException(" Wrong Doughnats! ");

        }
        return toReturn;
    }
    public static void eatRandomDoughnut(DoughnutsFactory factory){
        System.out.printf("What a surprise! ");
        getRandomDoughnut(factory).eat();

    }

    public static Doughnut getRandomDoughnut(DoughnutsFactory factory){
        Random random = new Random();
        DoughnutTypes type = DoughnutTypes.values()[random.nextInt(DoughnutTypes.values().length)];

        return(factory.getDoughnut(type));
    }
    public void getAllElementFactory() {
        for (int i = 0; i < DoughnutTypes.values().length; i++)
            System.out.println(DoughnutTypes.values()[i]);
    }

}
