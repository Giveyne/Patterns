package Singlton;
// реализация Била Пьюи один обьект внутри статик класса создасться только после вызова(Lazy)
public class SingltonUser{

    private SingltonUser (){}

    private static class SingltonUserGet {
        private static final SingltonUser getSingltonUser = new SingltonUser();
    }

    public static SingltonUser getGetSingltonUser() {

        return SingltonUserGet.getSingltonUser;
    }
}