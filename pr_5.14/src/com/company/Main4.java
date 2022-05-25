package com.company;
import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        System.out.println("Введіть довільне ім'я :");
        String a , b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextLine();
        System.out.println("Введіть наступне ім'я");
        b = scan.nextLine();
        if (a.equalsIgnoreCase(b)){
            System.out.println("Імена ідентичні");
        }else{
            System.out.println("Імена не ідентичні");
        }
    }
}