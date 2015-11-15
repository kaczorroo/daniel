package com.company;

import java.util.Scanner;

public class Task2{
    public static void main(String [] args) {
        /**
         * Program, który pobiera od użytkownika liczbę całkowitą dodatnią, a następnie wyświetla na ekranie kolejno
         * wszystkie liczby niepatrzyste nie większe od podanej liczby. Przykład, dla 15 program powinien
         * wyświetlić 1, 3, 5, 7, 9, 11, 13, 15.
         *
         * @param args
         */
        System.out.println("Podaj liczbe");
        /**Uzywamy funkcji skanera do zaladwania do programu naszego x.*/
        String x;
        Scanner odczyt = new Scanner(System.in);
        x = odczyt.nextLine();
        /**Przerabiamy funkcje String na funkcje int aby moc pozniej wykorzystac do petli
         * nasza wprowadzona liczbe ktora z x zamienia sie w a
         */
        int a = Integer.parseInt(x);
        System.out.println("Wybrales liczbe " + x);
        /**Stawiamy warunek for ktory wypisze nam wszystkie liczby az do x
         * a nastepnie stawiamy warunek if ktory sprawi ze wyswietlone zostana tylko liczby nieparzyste
         * az do x
         */

        for(int i = 1; i<a; i++)
        {
            if(i%2 == 1)
            {
                System.out.println(i);
            }
        }

    }
}
