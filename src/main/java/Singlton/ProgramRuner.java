package Singlton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
// Различные реализации синглтонов
public class ProgramRuner {
    private static String pole = "aaa";
    public static void main(String[] args) {
    // Логер синлтон для записи логов
        SingltonLogger sin = SingltonLogger.getSingltonLogger();
             SingltonLogger.getSingltonLogger().addLogInfo("First log");
             SingltonLogger.getSingltonLogger().addLogInfo("2 log");
             SingltonLogger.getSingltonLogger().addLogInfo("3 log");
             SingltonLogger.getSingltonLogger().addLogInfo("4 log");
             SingltonLogger.getSingltonLogger().showLogFile();
                System.out.println(sin.toString());
// Ленивая реализация синглтона
        LazySinglton io1 = LazySinglton.getInstance();// создаем 1й
        System.out.println(io1.toString());
        LazySinglton io2 = LazySinglton.getInstance();// пытаемся создать 2ой но получаем 1й
        System.out.println(io2.toString());

        ExecutorService service = Executors.newFixedThreadPool(4);
        service.submit(new Thread(()-> {
            System.out.println(Thread.currentThread().getName());
            SingltonUser singltonUser = SingltonUser.getGetSingltonUser();
            System.out.println(singltonUser.toString());
            }));
        service.submit(new Thread(()-> {
            SingltonUser singltonUser1 = SingltonUser.getGetSingltonUser();
            System.out.println(singltonUser1.toString());
        }));
        service.submit(new Thread(()-> {
            SingltonUser singltonUser2 = SingltonUser.getGetSingltonUser();
            System.out.println(singltonUser2.toString());
        }));
        service.submit(new Thread(()-> {
            SingltonUser singltonUser3 = SingltonUser.getGetSingltonUser();
            System.out.println(singltonUser3.toString());
        }));
        service.submit(new Thread(()-> {
            SingltonUser singltonUser4 = SingltonUser.getGetSingltonUser();
            System.out.println(singltonUser4.toString());
        }));
       service.shutdown();

        EnumSinglton obj1 = EnumSinglton.INSTANCE;
        obj1.someInteger = 1;
        obj1.getInstanse();
        EnumSinglton obj2 = EnumSinglton.INSTANCE;
        obj2.someInteger = 2;
        obj1.getInstanse();


    }
}

