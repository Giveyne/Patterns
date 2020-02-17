package Singlton;

public class SingltonLogger {
    private static SingltonLogger singltonLogger; // Создали поле статическоо класса
    private static String logger = "This is log file \n\n"; // поле для дальнейшей реализации синглтона

    public static synchronized SingltonLogger getSingltonLogger() { // создали метод через который внешние пользователи
        if (singltonLogger == null ) // пользователь который захочет создать второй экземпляр не попадет в создание ему вернется уже созданный
            singltonLogger = new SingltonLogger(); //инициировали экземляр класса 
        return singltonLogger;
    }
    private SingltonLogger(){} // protect конструктор для того чтобы никто снаружи не смог создать

    public void addLogInfo (String logInfo){
        logger += logInfo + "\n";
    }
    public void showLogFile (){
        System.out.println(logger);
    }
}
