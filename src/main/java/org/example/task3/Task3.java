package org.example.task3;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {

    Integer scanNumberOfIterations() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any positive number: ");
        int numberOfIterations;
        try {
            numberOfIterations = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("This is not an integer, pls try again");
            return scanNumberOfIterations();
        }
        if (numberOfIterations <= 0) {
            System.out.print(numberOfIterations + " is not a positive integer.\n");
            return scanNumberOfIterations();
        }
        return numberOfIterations;
    }

    List<Set<Integer>> getListOfPairs(int numberOfIterations) {
        List<Set<Integer>> listOfPairs = new ArrayList<>();
        for (int i = 1; i <= numberOfIterations; i++)
            listOfPairs.add(scanPairOfNumbers(i));

        return listOfPairs;
    }

    private Set<Integer> scanPairOfNumbers(int iteration) {
        Set<Integer> pairOfNumbers = new HashSet<>();
        int firstNumber = scanFirstNumber(iteration);
        pairOfNumbers.add(firstNumber);
        pairOfNumbers.add((scanSecondNumber(firstNumber, iteration)));
        return pairOfNumbers;
    }

    private Integer scanFirstNumber(int iteration) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first positive number from pair " + iteration + ": ");
        int firstNumber;
        try {
            firstNumber = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("This is not an integer, pls try again");
            return scanFirstNumber(iteration);
        }
        if (firstNumber <= 0) {
            System.out.print(firstNumber + " is is not a positive integer.\n");
            return scanFirstNumber(iteration);
        }
        return firstNumber;
    }

    private Integer scanSecondNumber(int firstNumber, int iteration) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter second positive number from pair " + iteration + ": ");
        int secondNumber;
        try {
            secondNumber = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("This is not an integer, pls try again");
            return scanSecondNumber(firstNumber, iteration);
        }
        if (secondNumber <= 0) {
            System.out.print(secondNumber + " is is not a positive integer.\n");
            return scanSecondNumber(firstNumber, iteration);
        }
        if (secondNumber == firstNumber) {
            System.out.print("Second number have to be different then first one.\n");
            return scanSecondNumber(firstNumber, iteration);
        }
        return secondNumber;
    }

    int calculateNumberOfGraphs(List<Set<Integer>> listOfPairs) {
        List<Set<Integer>> listOfGraphs = new ArrayList<>();
        Set<Integer> allVertices = new HashSet<>();
        for (int i = 0; i <= listOfPairs.size() - 1; i++) {
            Set<Integer> pair = listOfPairs.get(i);
            if (isPartOfPreviousGraphs(pair, allVertices))
                addPairToProperGraph(pair, listOfGraphs);
            else
                createNewGraph(listOfGraphs, pair);

            allVertices = getAllVertices(listOfGraphs);
        }
        return listOfGraphs.size();
    }

    private void addPairToProperGraph(Set<Integer> pair, List<Set<Integer>> listOfGraphs) {
        List<Set<Integer>> graphsIncludingPair = findAllGraphsIncludingPair(pair, listOfGraphs);
        if (graphsIncludingPair.size() > 1) {
            graphsIncludingPair.get(0).addAll(pair);
            graphsIncludingPair.get(0).addAll(graphsIncludingPair.get(1));
            listOfGraphs.remove(graphsIncludingPair.get(1));
        } else {
            graphsIncludingPair.get(0).addAll(pair);
        }
    }

    private List<Set<Integer>> findAllGraphsIncludingPair(Set<Integer> pair, List<Set<Integer>> listOfGraphs) {
        List<Set<Integer>> graphsIncludingPair = new ArrayList<>();
        listOfGraphs.forEach(graph -> {
            if (graph.stream().anyMatch(pair::contains))
                graphsIncludingPair.add(graph);
        });
        return graphsIncludingPair;
    }

    private void createNewGraph(List<Set<Integer>> listOfGraphs, Set<Integer> pair) {
        listOfGraphs.add(pair);
        getAllVertices(listOfGraphs);
    }

    private Set<Integer> getAllVertices(List<Set<Integer>> listOfGraphs) {
        return listOfGraphs
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }

    private boolean isPartOfPreviousGraphs(Set<Integer> pair, Set<Integer> allVertices) {
        return pair.stream().anyMatch(allVertices::contains);
    }
}