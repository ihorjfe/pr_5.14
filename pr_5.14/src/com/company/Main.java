package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Ведіть 5 слів");
        Scanner sc = new Scanner(System.in);
        String s1, s2, s3, s4, s5;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        s4 = sc.nextLine();
        s5 = sc.nextLine();
        String a = s1.concat(" ").concat(s2).concat(" ").concat(s3).concat(" ").concat(s4).concat(" ").concat(s5).concat(".");
        System.out.println(a);
        }
    }

