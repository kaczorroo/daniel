package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by user on 2015-11-12.
 */

/**
 * Napisać funkcję liczZnakiSlowa, która zlicza:
 * • liczbę znaków w pliku,
 * • liczbę białych znaków w pliku (białe znaki to spacja, tabulator, znacznik końca wiersza),
 * • liczbę słów w pliku.
 *
 * Wynikiem funkcji jest tablica złożona z 3 liczb całkowitych po jednej dla wymienionych podpunktów.
 *
 */

public class TaskHome2 {
    public static void main (String [] args) throws FileNotFoundException {
        System.out.println("Start programu.");
        /**Plik musi się znajdować w głównym folderze programu w moim przypadku jest to (...)/Java/Program/TaskHome2.txt*/
        System.out.println("Wpisz nazwę pliku, który chcesz wczytać do programu " +
                "(pamiętaj aby znajdował się w głównym folderze programu):");
        Scanner tekst = new Scanner(System.in);
        String t = tekst.next();
        tekst.close();

        String file = t ;
        int znaki[] = new int[3];
        znaki[0] = ileznakow(file);
        znaki[1] = biale(file);
        znaki[2] = slowa(file);
        System.out.println("W załadowanym pliku " + file + " jest:");
        System.out.println(znaki[0] + " znaków.");
        System.out.println(znaki[1] + " znaków białych.");
        System.out.println("A ilość słów wynosi: " + znaki[2]);
        System.out.println("Koniec programu.");
    }
    public static int slowa(String plik) throws FileNotFoundException {
        /**
         * Tutaj piszemy funkcje sposob em rekurencyjnym
         * ktora obliczac nam bedzie ilosc slow w pliku.
         * */
        Scanner slowa = new Scanner(new File(plik));
        int s = 0;
        while (slowa.hasNext()) {
            slowa.next();
            s++;
        }
        slowa.close();
        return s;
    }

    public static int biale(String plik) throws FileNotFoundException{
        /**
         * dzieki useDelimiter okreslam jakie znaki maja byc brane pod uwage podczas liczenia
         * \s - \t\n\x0B\f\r - czyli biale znaki
         */
        Scanner bz = new Scanner(new File(plik)).useDelimiter("[ \\s]");
        int b = 0;
        while (bz.hasNext()){
            bz.next();
            b++;
        }
        bz.close();
        return b;
    }

    public static int ileznakow(String plik) throws FileNotFoundException{
        /**
         * w tym przypadku wybieram \S czyli ^\\s, co oznacza, że w tym przypadku białe znaki nas nie obchodzą
         * i będzie brane pod uwage wszystko poza znakami bialymi
         */
        Scanner znaki = new Scanner(new File(plik)).useDelimiter("[^\\s]");
        int z = 0;
        while (znaki.hasNext()) {
            znaki.next();
            z++;
        }
        znaki.close();
        return z;
    }
}