package com.company;

import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здраствуйте! Это наш список по имени <<A>>. " +
                "\nВведите сюда 5 слов, в одну строку по одному слову \uD83D\uDC47");
        String strok = scanner.next();
        String strok1 = scanner.next();
        String strok2 = scanner.next();
        String strok3 = scanner.next();
        String strok5 = scanner.next();
        user.setWrite(strok);
        user.setWrite(strok1);
        user.setWrite(strok2);
        user.setWrite(strok3);
        user.setWrite(strok5);

        System.out.println("Вашa строка1: " + user.getWrite(strok) +
                "\nВашa строка2: " + user.getWrite(strok1) +
                "\nВашa строкa3: " + user.getWrite(strok2) +
                "\nВашa строкa4: " + user.getWrite(strok3) +
                "\nВашa строкa5: " + user.getWrite(strok5));

        System.out.println("____________________________________________________");

        System.out.println("Это наш ещё один список по имени <<B>>." +
                " Пожалуйста введите ещё 5 слов, в одну строку по одному слову \uD83D\uDC47");
        String strok6 = scanner.next();
        String strok7 = scanner.next();
        String strok8 = scanner.next();
        String strok9 = scanner.next();
        String strok10 = scanner.next();
        user.setWrite(strok6);
        user.setWrite(strok7);
        user.setWrite(strok8);
        user.setWrite(strok9);
        user.setWrite(strok10);

        System.out.println("Вашa строка6: " + user.getWrite(strok6) +
                "\nВашa строка7: " + user.getWrite(strok7) +
                "\nВашa строкa8: " + user.getWrite(strok8) +
                "\nВашa строкa9: " + user.getWrite(strok9) +
                "\nВашa строкa10: " + user.getWrite(strok10));

        System.out.println("_______________________________________________________");
        System.out.println("Это ещё один список по имени <<C>>." +
                " Это список смешаный со списком <<A>> и <<B>>\uD83D\uDC47");
        System.out.println("A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1");
        System.out.println("Вашa строка1: " + user.getWrite(strok) +
                "\nВашa строкa10: " + user.getWrite(strok10) +
                "\nВашa строка2: " + user.getWrite(strok1)   +
                "\nВашa строкa9: " + user.getWrite(strok9) +
                "\nВашa строкa3: " + user.getWrite(strok2) +
                "\nВашa строкa8: " + user.getWrite(strok8) +
                "\nВашa строкa4: " + user.getWrite(strok3) +
                "\nВашa строка7: " + user.getWrite(strok7) +
                "\nВашa строкa5: " + user.getWrite(strok5) +
                "\nВашa строка6: " + user.getWrite(strok6) );
       
    }
}