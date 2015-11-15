package com.company;

import java.io.Serializable;

/**
 * Created by user on 2015-11-10.
 */
public class Task1 implements Serializable {

    /**
     * Program do konwersji warto�ci temperatury podanej w stopniach Celsjusza
     * na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie Celsjusza + 32.0)
     *
     * @param args
     */
    public static void main(String[] args) {
        double wynik;
        double celsjusz;
        celsjusz = 20;
        wynik =  1.8 * celsjusz + 32.0;
        System.out.println("Przy " + celsjusz + " stopniach Celsjusza, Fahrenheity wynoszą " + wynik + ".");
    }
}