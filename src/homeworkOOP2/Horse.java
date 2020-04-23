package homeworkOOP2;

public class Horse extends Animals{
    public Horse (String name,double jump,int swiming,int run){
        super(name,jump,swiming,run);
    }



    @Override
    protected void swiming() {
        System.out.println(name + " Проплыл " +  swiming + " метров");

    }

    @Override
    protected void jumpover() {
        System.out.println(name + " Перепрыгнул" + " " + jump + " метра");

    }
}
