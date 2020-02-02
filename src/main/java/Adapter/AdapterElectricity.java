package Adapter;

class AdapterElectricity {

    public static void main(String[] args) {
        AmericanElectricity america = new America();
        america.getPower();
        EuroElectricity euroElectricity = new Adapter(america);
        Radio radio = new Radio();
        radio.listenRadio(euroElectricity);
    }
}

interface EuroElectricity {
    void getPower();        //Два разных интерфейса Евро и Америка
}

interface AmericanElectricity {
    void getPower();        //Два разных интерфейса Евро и Америка
}

//Создаем класс адаптер для связи двух разных интрефейсов
class Adapter implements EuroElectricity { // имлементируем один интерфейс
    AmericanElectricity americanElectricity; //Внутри класса адаптера создаем поле с другим интефейсом

    public Adapter(AmericanElectricity americanElectricity) {
        this.americanElectricity = americanElectricity;
    }

    @Override
    public void getPower() {// теперь наши приборы могут работать от второго интерфейса
        americanElectricity.getPower();
    }
}

class America implements AmericanElectricity { // класс имлементирующий второй интерфейс
    @Override
    public void getPower() {
        System.out.println("Electrica forever");
    }
}

class Radio { // обькет использования к которому надо подключить второй интерфейс
    public void listenRadio(EuroElectricity euroElectricity) {

        euroElectricity.getPower();
    }
}