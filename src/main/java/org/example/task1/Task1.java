package org.example.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public String[] readUserInput() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] stringsArray;
        try {
            stringsArray = reader.readLine().split(" ");
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
        return stringsArray;
    }

    public void sortNumbers(String[] numbers) {
        List<Integer> sortedIntList;
        try {
            sortedIntList = Arrays.stream(numbers)
                    .distinct()
                    .map(Integer::parseInt)
                    .sorted()
                    .collect(Collectors.toList());

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Wrong format of input - there non number char");
        }
        sortedIntList.forEach(p -> System.out.print(p + " "));
        System.out.println("\n" + "count: " + numbers.length);
        System.out.println("distinct: " + sortedIntList.size());
        System.out.println("min: " + Collections.min(sortedIntList));
        System.out.println("max: " + Collections.max(sortedIntList));
    }
}
