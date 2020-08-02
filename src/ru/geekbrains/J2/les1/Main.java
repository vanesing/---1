package ru.geekbrains.J2.les1;








public class Main {


    public static <move> void main(String[] args) {
        Cat c = new Cat(1,50,"Барсик");
        Robat robat = new Robat(4,400,"Федор");
        Human human = new Human(2,150,"Илья");


            Runners [] runners = {c,robat,human};
            for (int i =0;i< runners.length;i++) {
                runners[i].jumpingOver();
                runners[i].run();

            }


        }


      


}