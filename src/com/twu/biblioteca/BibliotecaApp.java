package com.twu.biblioteca;

import java.util.Random;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("please enter a number ");
//        int rightNumber = (int)(Math.random() * 100);
//        int i = 0;1
//        while ( i != rightNumber) {
//            i = Integer.parseInt(scanner.next());
//            if (i < rightNumber)
//                System.ou1t.prin1tln("too low");
//            else if (i > rightNumber)
//                System.out.println("too large");
//            else
//                System.out.println("exactly!");
//
//        }
        LibraryService service = new LibraryService();
        service.start();
    }
}
