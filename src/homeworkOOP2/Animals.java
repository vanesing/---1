package homeworkOOP2;

public abstract class Animals{
    protected String name;
    protected double jump;
    protected int swiming;
    protected int run;

    Animals() {

    }



    public Animals(String name, int run, double jump, int swiming) {
    }
    protected Animals(String name, double jump, int swiming, int run) {
        this.name = name;
        this.jump = jump;
        this.swiming = swiming;
        this.run = run;

    }




    protected  void run() {
        System.out.println(name + " Бежит " +run + " Метров");
    }
    protected abstract void swiming();
    protected abstract void  jumpover();



}

