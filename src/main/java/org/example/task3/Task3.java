package org.example.task3;

import java.util.*;

class Task3 {

    void DFS(int vertex, Set<Integer> visited, Map<Integer, Set<Integer>> adj) {
        Stack<Integer> stack = new Stack<>();
        stack.push(vertex);
        while (!stack.empty()) {
            vertex = stack.pop();
            visited.add(vertex);

            for (Integer neighbor : adj.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                }
            }
        }
    }

    void connectedComponents(Map<Integer, Set<Integer>> adj) {
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