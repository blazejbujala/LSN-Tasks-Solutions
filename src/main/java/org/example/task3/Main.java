package org.example.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int numberOfAdj = scan.nextInt();

        Task3 task3 = new Task3(numberOfAdj+10);

        for (int i = 0; i < numberOfAdj; i++) {
            task3.addEdge(scan.nextInt(), scan.nextInt());
        }
        System.out.println("Number of graphs: ");
        task3.connectedComponents();
    }

}
