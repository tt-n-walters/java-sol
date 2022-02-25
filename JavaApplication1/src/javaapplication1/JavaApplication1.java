package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Student a = new Student();
        int x;
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what's your name?");
        a.name = input.nextLine();
        System.out.println("Nice to meet you " + a.name + ". How are you today?");
    }
}

