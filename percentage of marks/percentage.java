package com.percentage;

import java.util.Scanner;

public class percentage {

    int[] a= new int[5];
    int sum = 0;
    int per = 0;
    char i;

    public void getmarks() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks for 5 subjects");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

            per = (sum * 100) / 500;

            System.out.println("percentage is :" + per);

            if(per>80)
                System.out.println("grade A");
            else if(per<80 && per>60)
                System.out.println("grade B");
            else if(per<60 && per>40)
                System.out.println("grade C");
            else
                System.out.println("fail");


        }
    }

