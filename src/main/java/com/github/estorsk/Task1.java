package com.github.estorsk;


public class Task1 {

    private static Integer min;
    private static Integer max;
    private static Integer b;

    public static void run() {

//        Заполните массив случайным числами и выведете максимальное,
//        минимальное и среднее значение.
//        Для генерации случайного числа используйте метод Math.random(),
//        который возвращает значение в промежутке [0, 1].

        int[] arr = new int[10];
        int i = 0;

        for (i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 1));
        }

        max = arr[0];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }

        min = arr[0];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }

        b = (min + max) / 2;
    }

    public Task1() {
        this.max = getMax();
        this.min = getMin();
        this.b = getB();
    }

    public Integer getMin() {
        return min;
    }

    public Integer getMax() {
        return max;
    }

    public Integer getB() {
        return b;
    }

}
