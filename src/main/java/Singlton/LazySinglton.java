package Singlton;
// Ленивая инициализация с двойной проверкой
public class LazySinglton {
    private static LazySinglton instance;
    private LazySinglton(){}

    public static LazySinglton getInstance(){
        if(instance == null) {
            synchronized (LazySinglton.class){
                if(instance == null) {
                    instance = new LazySinglton();
                }
            }
        }
        return instance;
    }

}
