package ru.geekbrains.J2.les1;

public abstract class Runners implements Wall,RunnigTrack {

    int jump;
    int rundistanse;
    String name;


    Runners () {

    }

    public Runners(int jump, int rundistanse, String name) {
        this.jump = jump;
        this.name = name;
        this.rundistanse = rundistanse;

    }

    @Override
    public void run() {

    }

    @Override
    public void jumpingOver() {

    }
}
