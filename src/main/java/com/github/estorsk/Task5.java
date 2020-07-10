package com.github.estorsk;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    private static List<String> elementAll = new ArrayList<>();

    public static void run() {

//    Построй частотный словарь букв русского алфавита.
//    На вход даем предложение(пример): «Это просто предложение»
//    На выходе должно вывести в консоль:
//    а - 5 раз
//    б - 1 раз
//    в - 0 раз
//    ...
//    я - 1 раз

        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] alphabetList = alphabet.toCharArray();

        String srt = "Это просто предложение";
        char[] srtList = srt.toCharArray();

        for (char elementAlp : alphabetList) {
            int i = 0;
            for (char elementStr : srtList) {
                if (elementStr == elementAlp) {
                    i++;
                }
            }
//            System.out.println(elementAlp + " - " + i);
            elementAll.add(elementAlp + " - " + i);
//            System.out.println();
        }

    }

    public Task5() {
        this.elementAll = getElementAll();
    }

    public List<String> getElementAll() {
        return elementAll;
    }

}
