package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        String first;
        String last;
        String suffix;
        String middle;
        String fullname;
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

        System.out.println(fullname = first + " " + last + " " + middle + " " + suffix);
    }
}