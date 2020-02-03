package Singlton;

enum EnumSinglton {
        INSTANCE;
        int someInteger;
        public void getInstanse(){
            System.out.println(someInteger);
        }
    }

