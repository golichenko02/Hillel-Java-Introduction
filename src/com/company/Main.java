package com.company;

public class Main {

    public static void main(String[] args) {


        float sumResult = sum(15, 5);
        float subResult = sub(sumResult * 4, 10);
        float mulResult = mul(42, 4);
        float divResult = div(12, 2);
        float remResult = remainder(15,2);
        System.out.println("Your sumResult:" +sumResult);
        System.out.println("Your subResult:" +subResult);
        System.out.println("Your mulResult:" +mulResult);
        System.out.println("Your divResult:" +divResult);
        System.out.println("Your remResult:" +remResult);

    }

    public static float sum(float a, float b){
        return a+b;
    }
    public static float sub( float a, float b){
        return a-b;
    }
    public static float mul( float a, float b){
        return a*b;
    }
    public static float div( float a, float b){
        return a/b;
    }
    public static float remainder(float a, float b){
        return a%b;
    }

}