package com.github.estorsk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task4 {

    private static List<Integer> arr = new ArrayList<>();
    private static Integer number = 4;

    public static void run(){

//        Удаление из массива
//        Дан массив целых чисел и ещё одно целое число.
//        Удалите все вхождения этого числа из массива (пропусков быть не должно).



//        Заполнение массива рандомными числами
        for (int i = 0; i < 30; i++){
            arr.add((int) Math.round(Math.random() * 10));
        }


//        Поиск числа в массиве и удаление
        for(Iterator<Integer> arrIterator = arr.iterator(); arrIterator.hasNext();){
            Integer arrNext = arrIterator.next();
            if (arrNext == number){
                arrIterator.remove();
            }
        }


    }

    public Task4() {
        this.arr = getArr();
    }

    public List<Integer> getArr() {
        return arr;
    }

}
