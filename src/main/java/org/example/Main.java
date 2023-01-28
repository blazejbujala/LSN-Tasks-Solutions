package org.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Task1 numberList = new Task1();
        numberList.sortNumbers(numberList.readUserInput());

        Task2 task2 = new Task2();
        task2.printPairs(task2.readUserInput(), 13);
    }
}
