package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any day: ");
        int day = sc.nextInt();

        if (day==1 || day==3 || day==5){
            System.out.println("JAVA LESSON");
        }else if (day==2 || day==4){
            System.out.println("TECHNICAL ENGLISH");
        }else if (day==6 || day==7){
            System.out.println("HOLIDAY!");
        }else{
            System.out.println("YOU ENTERED WRONG NUMBER");
        }
    }
}
