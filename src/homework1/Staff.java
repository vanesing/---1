package homework1;

public class Staff  {

    public String firstname;
    public String lastname;
    public int salary;
    public int age = 25 ;


    //конструктор по умолчанию
    Staff(){

    }

    Staff (String firstname,String lastname,int salary,int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.age =age;

    }

    public void salary (int min, int max) {
        final int mn = 20000;
        final int m = 60000;


    }

    public int getAge() {
        return age;
    }
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }





    public void card() {

        System.out.printf ("Имя:%s, Возраст:%d, Зарплата:%d", firstname + lastname ,age, salary);
    }

    int [][] Staff = new int[5][4];

}



