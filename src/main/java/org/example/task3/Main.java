package org.example.task3;

public class Main {

    public static void main(String args[]) {

        Input input = new Input();
        Task3 task3 = new Task3();

        task3.connectedComponents(input.readUserInput());
    }

}