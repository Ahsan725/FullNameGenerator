package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        String first;
        String last;
        String suffix;
        String middle;
        System.out.println("Enter your first name?");

        Scanner scanner = new Scanner(System.in);
        first = scanner.nextLine();

        System.out.println("Last Name: ");
        last = scanner.nextLine()
;
        System.out.println("Middle Name: ");
        middle = scanner.nextLine();

        System.out.println("What is your suffix?");
        suffix = scanner.nextLine();

        if (!middle.isEmpty() && (!suffix.isEmpty())){
            System.out.println(first + " " + middle + " " + last + " " + suffix);
        }else if (!middle.isEmpty()){
            System.out.println(first + " " + middle + " " + last);
        }else if(!suffix.isEmpty()){
            System.out.println(first + " " + last + " " + suffix);
        }else
        {
            System.out.println(first + " " + last);
        }

    }
}