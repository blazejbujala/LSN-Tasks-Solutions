package org.example.task3;

import java.util.*;

public class Input {

    public Map<Integer, Set<Integer>> readUserInput() {
        Map<Integer, Set<Integer>> adj = new HashMap<>();

        Scanner scan = new Scanner(System.in);
        int numberOfAdj = scan.nextInt();

        for (int i = 0; i < numberOfAdj; i++) {
            addEdge(adj, scan.nextInt(), scan.nextInt());

        }
        return adj;
    }

    void addEdges(Map<Integer, Set<Integer>> adj, int v, int w) {
        addEdge(adj, v, w);
        addEdge(adj, w, v);
    }

    void addEdge(Map<Integer, Set<Integer>> adj, int firstVertex, int secondVertex) {
        if (adj.containsKey(firstVertex)) {
            adj.get(firstVertex).add(secondVertex);

        } else {
            adj.put(firstVertex, new HashSet<>());
            adj.get(firstVertex).add(secondVertex);
        }
    }
}