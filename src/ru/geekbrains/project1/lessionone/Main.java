package ru.geekbrains.project1.lessionone;


public class Main {

    public static void main(String[] args) {


        method1();
        method2();
        method3();
        method4();
        method5();
        arrays();

    }
    public static String arrays(){

        //arrays
        int [] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        int i =0;
        do {
            if (i != 0) continue;
            if (i>1) break;
        } while ( i<10);

        int [] arr2 = new int [8];
        for (int l = 0; i<9; i++) {
            for (int e =0; i<3; i++) {

            }
        }

        int [] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int q1 = 0;
        do {
            if(q1 < 6) {
                q1= q1 *2;
            }

        }while (q1 <12);

        int [] arr4 = new int[0];
        int max  = 0;
        int min =0;

        for (max = 0; max <arr4.length; max++ ) {

            return "max";

        }
        for (min = 0; max <arr4.length ; max-- ){
            return "min";
        }

        return null;
    }



    private static void method1() {
        //результат выражения (с/d) в скобках, одну из переменных нужно было вывести во float
        // потому, как результат их деления дает цифру с плавающей точкой

        int a = 10;
        int b = 20;
        float c = 30;
        int d = 40;
        float f;
        f = a * (b +  (c / d));
        System.out.println(f);
    }
    private static void method2() {

        // не совсем уверен что это верный код
        // но по логике задания вроде то
        //

        int a = 0;
        System.out.println("Введите первое число:" + a);

        int b = 0;
        System.out.println("Введите второе число:" + b);
        int c = a + b;


        if (c<10 || c<21) {
            boolean b1 = true;
        }else {
            boolean b1 = false;
        }

       }

       private static void  method3 () {
        int p = 0;
        System.out.println("Введите число для проверки:" + p);
        if (p <0) System.out.println("Число отрицательное");
        else if (p>0) System.out.println("Число положительное");



       }
       private static void method4() {
        String t = new String();
        System.out.println("Введите имя:" + t);
        System.out.println("Привет,"+t);


       }
       private static void method5() {
        int d =0;
        System.out.println("Какой сейчас год?" +d);
           if (d % 4 == 0) {
               System.out.println("Високосный год");
           }else if (d % 4 ==1) {
               System.out.println("Год не високосный");
           }
           }
       }




