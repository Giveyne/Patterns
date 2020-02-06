package Builder;
//Builder — это порождающий паттерн проектирования, который позволяет создавать сложные объекты пошагово.
//Builder даёт возможность использовать один и тот же код строительства для получения разных
//        представлений объектов.
// Когда вы хотите избавиться от «телескопического конструктора».
public class MainDirector {
    public static void main(String[] args) {
        Car sportCar = new CarBuilder().setSeats(2).setEngine(120).setGPS(true).build();
        sportCar.create();
        Manual manualForTrack = new CarManualBuilder().setEngine(300).setGPS(true).setSeats(3).setTripComputer(true).manualBuild();
        manualForTrack.create();
    }
}
//    Car create
//    Your car have:
//        Count seats: 2
//        Engine power: 120
//        TripComputer: false
//        GPS: true
//      This Manual you car
//        You have:
//        Count seats: 3
//        Engine power: 300
//        tripComputer: true
//        GPS: true