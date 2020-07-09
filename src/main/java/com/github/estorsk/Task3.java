package com.github.estorsk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {

    private static List<Integer> arr = new ArrayList<>();

    public static void run(){

//      Реализовать алгоритм сортировки пузырьком для сортировки массива.


        for(int i = 0; i < 10; i ++) {
            arr.add((int) Math.round(Math.random() * 9));
        }


//        Сортировка коллекции массива
        Collections.sort(arr);

    }

    public Task3() {
        this.arr = getArr();
    }

    public List<Integer> getArr() {
        return arr;
    }
}
