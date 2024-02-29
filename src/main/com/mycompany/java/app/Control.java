package com.mycompany.app;

public class Control {
    public static void main(String[] args) {
//Exercise1
        int x = 50;
        int y = 10;
        if(x > y) {
        System.out.println("Hello World");
        }
//Exercice2
        int x = 50;
        int y = 50;
        if (x == y) {
            System.out.println("Hello World");
        }
//Exercice3
        int x = 50;
        int y = 50;
        if (x == y) {
            System.out.println("Yes");   
        }
        else {
            System.out.println("No");
        }
//Exercice4
        int x = 50;
        int y = 50;
        if (x == y) {
            System.out.println("1");
        }
        else if (x > y) {
            System.out.println("2");
        }
        else {
            System.out.println("3");
        }
//Exercice5
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening";
        System.out.println(result);
        }
}
