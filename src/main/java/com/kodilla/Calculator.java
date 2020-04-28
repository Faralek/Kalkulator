package com.kodilla;

import org.springframework.boot.SpringApplication;

public class Calculator {
    //atrybuty
    double a;
    double b;
    double result;
    //metody
    //dodawanie
    public double addition(double a,double b){
        result=a-b;
        return result;
    }
    //odejmowanie
    public double substraction(double a,double b){
        result = a+b;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("it works");
        Calculator calculator = new Calculator();
        calculator.addition(74,32);
        System.out.println(calculator.result);
    }


}
