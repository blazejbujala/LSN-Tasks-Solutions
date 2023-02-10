package org.example.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Task2 {

    public List<Integer> readUserInput() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integerList = Arrays.stream(reader.readLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return integerList;
    }

    public void printPairs(List<Integer> list, int sum) {
        Map<Integer, Integer> mapOfInteger = new HashMap<>();
        for (int number : list) {
            int numberOfOccurrences = 1;
            if (mapOfInteger
                    .containsKey(number)) {
                numberOfOccurrences = mapOfInteger.get(number) + 1;
                mapOfInteger.put(number, numberOfOccurrences);
            }
            mapOfInteger.put(number, numberOfOccurrences);

        }
        mapOfInteger.forEach((integer, occurrences) -> {
            if ((integer <= sum / 2) && mapOfInteger.containsKey(sum - integer))
                for (int j = 0; j < occurrences * mapOfInteger.get(sum - integer); j++)
                    System.out.println(integer + " " + (sum - integer));
        });
    }
}