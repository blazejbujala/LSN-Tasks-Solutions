package org.example.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Task2 {

    public List<Integer> readUserInput() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] stringsList;
        List<Integer> integerList;
        stringsList = reader.readLine().split(" ");
        integerList = Arrays.stream(stringsList)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return integerList;
    }

    public void printPairs(List<Integer> list, int sum) {
        Map<Integer, Integer> mapOfInteger = new HashMap<>();
        int numberOfOccurrences;
        for (int number : list) {
            if (mapOfInteger
                    .containsKey(number)) {
                numberOfOccurrences = mapOfInteger.get(number) + 1;
                mapOfInteger.put(number, numberOfOccurrences);
            } else {
                numberOfOccurrences = 1;
                mapOfInteger.put(number, numberOfOccurrences);
            }
        }
        for (int i = 0; i <= 6; i++) {
            if (mapOfInteger.containsKey(sum - i)) {
                int secondNumber = sum - i;
                for (int j = 0; j < mapOfInteger.get(i) * mapOfInteger.get(secondNumber); j++)
                    System.out.println(i + " " + secondNumber);
            }
        }
    }
}