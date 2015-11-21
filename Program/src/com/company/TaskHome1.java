package com.company;

import java.util.Scanner;

/**
 * Polecenie:
 * Napisz funkcję, która zwraca wartość n-tego wyrazu ciągu Fibonacciego. Funkcja powinna być napisana w
 * dwóch wersjach: iteracyjnej i rekurencyjnej.
 *
 */
 public class TaskHome1{
    public static void main(String [] args){
        Scanner wpisz = new Scanner(System.in);
        System.out.println("Start programu.");
        System.out.println("Podaj, ktory wyraz ciagu Fibonacciego chcesz uzyskac.");
        int i = wpisz.nextInt();
        wpisz.close();

        if(i<=45) {
            System.out.print(i + " wyraz ciagu Fibonacci'ego obliczony metoda Iteracyjna wynosi: ");
            System.out.println(firytacja(i));
        }
        else
            System.out.println("Zbyt dlugi czas obliczania ciagu!");

        if(i<=45){
            System.out.print(i + " wyraz ciagu Fibonacci'ego obliczony metoda Rekurencyjna wynosi: ");
            System.out.println(frekurencja(i));
        }
        else
            System.out.println("Zbyt dlugi czas obliczania ciagu!");
        System.out.println("Koniec programu!");
    }
    public static long frekurencja(long n){
        if(n==1 || n==0){
            return n;
        }
        else
            return frekurencja(n - 2) + frekurencja(n - 1);
    }
    public static long firytacja(long n){
        if(n==0) return 0;
        long a, b, c ;
        a = 1;
        b = 1;
        if(n<=2) return a;
        for(int i=0; i < n-2; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }


}
