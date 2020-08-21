package com.company;
public class MyFloatCalc {
    public static void main(String[] args) {
        System.out.println("SumResult:"+add(20.25,14.5));
        System.out.println("SubResult:"+sub(250,60.5));
        System.out.println("MulResult:"+mul(2.5,5));
        System.out.println("DivResult:"+div(mul(25,6),24));
        System.out.println("ModResult:"+mod(15,4));
        System.out.println("AverageResult:"+avg(12.5,50));
        System.out.println("PowResult:"+pow(25));
        System.out.println("25 percent of 50 is "+percent(50,25));
    }
    public static double add(double val1,double val2){
        return val1+val2;
    }
    public static double sub(double val1,double val2){
        return val1-val2;
    }
    public static double mul(double val1,double val2){
        return val1*val2;
    }
    public static double div(double val1,double val2){
        return val1/val2;
    }
    public static double mod(double val1, double val2){
        return val1%val2;
    }
    public static double avg(double val1, double val2) {
        return (val1 + val2) / 2;
    }
    public static double pow(double val) {
        return val *= val;
    }
    public static double percent(double val,double perent) {
        return val*=(perent/100);
    }

}

