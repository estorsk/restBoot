package com.github.estorsk;

public class Task8 {

    //    Задача 8:
//    Написать метод возведения числа в квадрат.
//    И далее к результату прибавить число 2.
//    Например,
//    если Вы ввели число 2, тогда в консоль должно быть выведено число 4 и 6
//    если Вы ввели число 3, тогда в консоль должно быть выведено число 9 и 11
//    если Вы ввели число 5, тогда в консоль должно быть выведено число 25 и 27
//    и т.д.
//    То есть твой метод возводит в квадрат, НО потом ты прибавляешь двойку

    private static Integer sqrAndTow = 2;

    protected static int sqr(Integer value) {

        int sqr = 2;
        int number = (int) Math.pow(value, sqr);
        return number;

    }

    public static int sqrAndTow(){
        return sqrAndTow = sqrAndTow + sqr(3);
    }

    public Integer getSqrAndTow() {
        return sqrAndTow;
    }

    //    Задача 8.1:
//    Написать метод возведения в куб

    private static Integer number;

    protected static int cube(Integer value) {

        int cube = 3;
        number = (int) Math.pow(value, cube);
        return number;

    }

    public Integer getNumber() {
        return number;
    }

    //    Задача 8.2:
//    Необходимо написать метод, который бы возводил число в степень.
//    И далее два числа, возведенные в степень, должны быть просуммированы,
//    а результат выведен в консоль.

    private static Integer sum;

    protected static int exponentiation(Integer number, double extent) {

        extent = Math.pow(number, extent);
        return (int) extent;
    }

    protected static int sum(){

        int number1 = exponentiation(2,3);
        int number2 = exponentiation(3,2);

        sum = number1 + number2;
        return sum;
    }

    public Integer getSum() {
        return sum;
    }

    public Task8() {
        this.sqrAndTow = getSqrAndTow();
        this.number = getNumber();
        this.sum = getSum();
    }
}
