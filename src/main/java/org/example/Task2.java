package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public List<Integer> readUserInput() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] stringsList;
        List<Integer> integerList;
        try {
            stringsList = reader.readLine().split(" ");
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        try {
            integerList = Arrays.stream(stringsList)
                    .map(Integer::parseInt)
                    .sorted()
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Wrong format of input - there is non number char");
        }
        return integerList;
    }

    public void printPairs(List<Integer> list, int sum) {
        List<Integer> integers = new ArrayList<>(list);
        integers
                .stream()
                .sorted()
                .filter(i -> list.contains(sum - i))
                .filter(i -> i <= sum / 2)
                .forEach(i -> System.out.println(i + " " + (sum - i)));
    }
}

