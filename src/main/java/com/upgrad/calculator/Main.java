package com.upgrad.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.upgrad.calculator");
        Calculator calculator = (Calculator) ctx.getBean("calculator");


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = sc.nextInt();
        System.out.println("Enter the second number:");
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the operation[add, sub]:");
        String op = sc.nextLine().toLowerCase();


        int res = calculator.compute(op, x, y);
        System.out.println(res);
    }
}
