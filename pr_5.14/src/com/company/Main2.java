package com.company;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        System.out.println("Ведіть 5 слів");
        Scanner sc = new Scanner(System.in);
        String s1, s2, s3, s4, s5;
        s1 = sc.nextLine();
        String a1 = s1.substring(0,1);
        s2 = sc.nextLine();
        String a2 = s2.substring(0,1);
        s3 = sc.nextLine();
        String a3 = s3.substring(0,1);
        s4 = sc.nextLine();
        String a4 = s4.substring(0,1);
        s5 = sc.nextLine();
        String a5 = s5.substring(0,1);
        System.out.println(a1+" "+a2+" "+a3+" "+a4+" "+a5);
    }
}