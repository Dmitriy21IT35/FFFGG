package com.company;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                System.out.println("Введите число");
                Scanner in = new Scanner(System.in);
                int X = in.nextInt();
                int Y = in.nextInt();


                int S = (X+Y)/(Y+1);
                System.out.println(S);
            }

        }




