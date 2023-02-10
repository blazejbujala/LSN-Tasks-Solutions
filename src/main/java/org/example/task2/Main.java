package org.example.task2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Task2 task2 = new Task2();
        task2.printPairs(task2.readUserInput(), 13);
    }
}