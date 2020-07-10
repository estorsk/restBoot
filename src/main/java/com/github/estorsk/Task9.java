package com.github.estorsk;

public class Task9 {


//    Задача 9:
//    Напишите метод, который бы возвращал в консоль
//    true, если число больше 5
//    и false, если число меньше 5

        private static Boolean statusNumber;

        public static boolean littleBig5(Integer number) {

            if (number > 5) {
                return statusNumber = true;
            } else {
                return statusNumber = false;
            }
        }

    public Task9() {
        this.statusNumber = getStatusNumber();
    }

    public Boolean getStatusNumber() {
        return statusNumber;
    }
}
