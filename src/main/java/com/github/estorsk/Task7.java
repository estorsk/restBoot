package com.github.estorsk;

public class Task7 {

    private static Integer numberMin;

    protected static int min(Integer number1, Integer number2) {

        if (number1 < number2){
            return numberMin = number1;
        } else {
            return numberMin = number2;
        }

    }

    public Task7() {
        this.numberMin = getNumberMin();
    }

    public Integer getNumberMin() {
        return numberMin;
    }

}
