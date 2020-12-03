package com.company;
import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args){

    Scanner input =  new Scanner (System.in);

    int x;
    int y;
    int z;

    System.out.print("enter first integer");
    x = input.nextInt();

    System.out.print("enter second integer");
    y = input.nextInt();

    System.out.print("enter third integer");
    z = input.nextInt();

  int  result = x * y * z;


    System.out.printf("result is %d%n" , result);

    }
}


