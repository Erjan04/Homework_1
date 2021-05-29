package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Здравствуйте,назовите свое имя!");
        Scanner s = new Scanner((System .in));
        System.out.println("Введите свое имя:");
        String name = s.nextLine();
        System.out.println(name + ",рад знакомству!");




    }
}
