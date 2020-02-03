package Bridge;
//Мост — это структурный паттерн проектирования, который разделяет один или несколько классов на две отдельные
//        иерархии — абстракцию и реализацию, позволяя изменять их независимо друг от друга.
// Паттерн мост служит для избежания роста методов в геометрической прогрессии от количества числа моделей
public class Main {
    public static void main(String[] args) {
        Venhicle audi = new Car(new Audi());
        Venhicle bmw = new Track(new BMW());
        Venhicle mersedes = new Car(new Mersedes());
        audi.drive();
        bmw.drive();
        mersedes.drive();
    }
}
//    I drive car audi
//    I drive Track BMW
//    I drive car Mersedes