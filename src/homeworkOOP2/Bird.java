package homeworkOOP2;

public class Bird extends Animals{
    public Bird (String name,double jump, int swiming,int run){
        super(name,jump,swiming,run);
    }




    @Override
    protected void swiming() {
        System.out.println(name + " Я не утка например!");

    }

    @Override
    protected void jumpover() {

        System.out.println(name + " Перепрыгнул" + " " + jump + " метра");

    }
}