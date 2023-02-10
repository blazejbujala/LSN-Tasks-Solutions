package org.example.task3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        int numberOfIterations = task3.scanNumberOfIterations();
        List<Set<Integer>> listOfPairs = task3.getListOfPairs(numberOfIterations);
        int numberOfGraphs = task3.calculateNumberOfGraphs(listOfPairs);
        System.out.print("Number of graphs: " + numberOfGraphs);

        Set<Integer> setOfNumbers = new HashSet<>();
        setOfNumbers.add(1);
        setOfNumbers.add(2);

    }
}
