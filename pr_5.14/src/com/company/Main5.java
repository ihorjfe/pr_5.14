package com.company;
import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        String a, b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть довільне речення :");
        a = scan.nextLine();
        System.out.println("Введіть довільне речення :");
        b = scan.nextLine();
        int c = a.length();
        int n = b.length();
        System.out.println(c);
        System.out.println(n);
        if (c > n){
            System.out.println("Більшу кількість символів має речення :"+a);
        }else{
            System.out.println("Більшу кількість символів має речення :"+b);
        }
    }
}