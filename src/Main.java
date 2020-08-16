public class Main{








    public static void main(String[] args){

        Ropes ropes =new Ropes();

        Thread thread = new Thread((Runnable) ropes);


        thread.start();

        class Ropes implements Runnable{


            @Override
            public void run() {

            }
        }


    }



}



