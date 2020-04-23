package homeworkOOP2;

public class Cat extends Animals{


    public Cat (String name, double jump, int run, int swiming){
        super(name,jump,run,swiming);


    }

    @Override
    public void swiming() {
        System.out.println(name + " Не поплыву я!");

    }

    @Override
    public void jumpover() {
        System.out.println(name + " Перепрыгнул" + " " + jump + " метра");

    }
}


