package com.company;
import  java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        float dollars,uah;
        Scanner scanDollar= new Scanner(System.in);
        System.out.print("Введите сумму в $ для обмена: ");
        dollars = scanDollar.nextFloat();

        if( dollars>=1000 &&dollars>0){
            uah=dollars*26;
            System.out.println("Ваша сумма в гривнах: "+uah);
        }
        else if(dollars<1000 && dollars>0){
            uah=dollars*25;
            System.out.println("Ваша сумма в гривнах: "+uah);
        }
        else{
            System.out.println("Введите положительное число");
        }
    }

}
