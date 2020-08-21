package com.company;

public class TypeConversion {
    public static void main(String[] args) {
     int a = 115;
     char b = (char)a;// int --> char
     System.out.println(b);
     long  x = 5, y = 2;
     double z =(double) x/y;// long --> double
     System.out.println(z);
     byte first = 12, second = 10;
     int result = first+second;// byte --> int
     System.out.println(result);
    }
}
