package Singlton;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ProgramRuner {
    private static String pole = "aaa";
    public static void main(String[] args) {


        SingltonLogger sin = SingltonLogger.getSingltonLogger();
        SingltonLogger.getSingltonLogger().addLogInfo("First log");
        SingltonLogger.getSingltonLogger().addLogInfo("2 log");
        SingltonLogger.getSingltonLogger().addLogInfo("3 log");
        SingltonLogger.getSingltonLogger().addLogInfo("4 log");
        SingltonLogger.getSingltonLogger().showLogFile();
        System.out.println(sin.toString());

        LazySinglton io1 = LazySinglton.getInstance();
        System.out.println(io1.toString());
        LazySinglton io2 = LazySinglton.getInstance();
        System.out.println(io2.toString());
        ExecutorService service = Executors.newFixedThreadPool(4);

        Thread i1 = new Thread(()-> {
            SingltonUser singltonUser = SingltonUser.getGetSingltonUser();
            System.out.println(singltonUser.toString());
        });
        Thread i2 = new Thread(()-> {
            SingltonUser singltonUser1 = SingltonUser.getGetSingltonUser();
            System.out.println(singltonUser1.toString());
        });
        Thread i3 = new Thread(()-> {
            SingltonUser singltonUser2 = SingltonUser.getGetSingltonUser();
            System.out.println(singltonUser2.toString());
        });
        Thread i4 = new Thread(()-> {
            SingltonUser singltonUser3 = SingltonUser.getGetSingltonUser();
            System.out.println(singltonUser3.toString());
        });
        Thread i5 = new Thread(()-> {
            SingltonUser singltonUser4 = SingltonUser.getGetSingltonUser();
            System.out.println(singltonUser4.toString());
        });
        Thread i6 = new Thread(()-> {
            SingltonUser singltonUser = SingltonUser.getGetSingltonUser();
            System.out.println(singltonUser.toString());
        });
        Thread i7 = new Thread(()-> {
            SingltonUser singltonUser1 = SingltonUser.getGetSingltonUser();
            System.out.println(singltonUser1.toString());
        });
        Thread i8 = new Thread(()-> {
            SingltonUser singltonUser2 = SingltonUser.getGetSingltonUser();
            System.out.println(singltonUser2.toString());
        });
        Thread i9 = new Thread(()-> {
            SingltonUser singltonUser3 = SingltonUser.getGetSingltonUser();
            System.out.println(singltonUser3.toString());
        });
        Thread i10 = new Thread(()-> {
            SingltonUser singltonUser4 = SingltonUser.getGetSingltonUser();
            System.out.println(singltonUser4.toString());
        });
        i1.start();
        i2.start();
        i3.start();
        i4.start();
        i5.start();
        i6.start();
        i7.start();
        i8.start();
        i9.start();
        i10.start();
    }
}
//        Singlton.LazySinglton@74a14482
//        Singlton.LazySinglton@74a14482

//        Singlton.SingltonUser@7858e8ff
//        Singlton.SingltonUser@7858e8ff
//        Singlton.SingltonUser@7858e8ff
//        Singlton.SingltonUser@7858e8ff
//        Singlton.SingltonUser@7858e8ff
//        Singlton.SingltonUser@7858e8ff
//        Singlton.SingltonUser@7858e8ff
//        Singlton.SingltonUser@7858e8ff
//        Singlton.SingltonUser@7858e8ff
//        Singlton.SingltonUser@7858e8ff
