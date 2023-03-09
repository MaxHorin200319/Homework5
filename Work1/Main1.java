package Homework5.Work1;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        totalScan();
    }
    public static void totalScan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть цифру :");
        Double number = sc.nextDouble();
        if(number % 2 == 0 & number % 1 == 0){
            System.out.println("Парне");
        }else if(number % 2 == 1 & number % 1 == 0) {
            System.out.println("Непарне");
        }
    }
}