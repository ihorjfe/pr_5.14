package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        double number1,number2 ,number3, max ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть дробове число :");
        number1 = scan.nextDouble();
        if (number1 % 1 != 0){
            System.out.println("Введіть наступне число :");
        }else {
            System.out.println("Ви ввели недробове число");
        }
        number2 = scan.nextDouble();
        if (number2 %1 != 0){
            System.out.println("Введіть наступне число :");
        }
        number3 = scan.nextDouble();
        if (number3 %1 != 0){
            System.out.println("Ви ввели числа правильно");
        }
        if (number1 >= number2 && number1 >= number3){
            max = number1;
            System.out.println();
        }else  if (number2 >= number1 && number2 >= number3){
            max = number2;
            System.out.println();
        }else {
            max = number3;
            System.out.println();
        }System.out.print("Найбільше дробове число : "+max);

    }
}