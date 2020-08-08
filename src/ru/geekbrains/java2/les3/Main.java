package ru.geekbrains.java2.les3;

import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        String [] words = new String[] {"Potato","Tomato","Watermelon","Dragonfruit","Tomato","Peach",
                "Avocado","Melon","Tomato","Pineapple","Watermelon","Watermelon", "Kiwi","Broccoli"};

        ArrayList <String> list = new ArrayList<>(Arrays.asList(words));
        for (int i = 0; i < words.length ; i++) {
            list.remove("Tomato");
            list.remove("Watermelon");


        }
        //Вывод списка
        System.out.println(list);



        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(new Contact("Sergeev","89256075514"));
        phoneBook.addContact(new Contact("Malyshev","89161572347"));
        phoneBook.addContact(new Contact("Petrov","89865912371"));
        phoneBook.getContact("Petrov");
    }



}
