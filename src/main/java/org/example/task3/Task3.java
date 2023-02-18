package org.example.task3;

import java.util.*;

class Task3 {

    void DFS(int n, Set visited, Map<Integer, List<Integer>> adj) {
        Stack<Integer> stack = new Stack<>();
        stack.push(n);
        int a = 0;
        while (!stack.empty()) {
            n = stack.peek();
            stack.pop();
            visited.add(n);

            for (Integer neighbor : adj.get(n)) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                }
            }
        }
    }

    void connectedComponents(Map<Integer, List<Integer>> adj) {
        Set<Integer> visited = new HashSet<>();
        int counter = 0;

        for (Integer vertex : adj.keySet()) {
            if (!visited.contains(vertex)) {
                DFS(vertex, visited, adj);
                counter++;
            }
        }
        System.out.println("Number of graphs: " + counter);
    }
}