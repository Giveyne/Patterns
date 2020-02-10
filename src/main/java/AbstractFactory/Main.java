package AbstractFactory;
// Фабрика Автомобилей описывает фабрику Седанов и фабрику Хетчбеков
//Классы автомобилей Форд и Тойота имплементируют фабрику машин
//классы чертежей ФордХ ФордСед и т.д говорят как нам создать автомобиль
public class Main {
    public static void main(String[] args) {
        CarFactory fordHatchback = new CarFord();
        fordHatchback.createHachback();
        CarFactory fordSedan = new CarFord();
        fordSedan.createSedan();
        CarFactory toyotaSedan = new CarToyota();
        toyotaSedan.createSedan();
        CarFactory toyotaHatchback = new CarToyota();
        toyotaHatchback.createHachback();
        }
    }
