package org.example.task3;

import java.util.*;

public class Input {

    public Map<Integer, List<Integer>> readUserInput() {
        Map<Integer, List<Integer>> adj = new HashMap<>();

        Scanner scan = new Scanner(System.in);
        int numberOfAdj = scan.nextInt();

        for (int i = 0; i < numberOfAdj; i++) {
            addEdge(adj, scan.nextInt(), scan.nextInt());

        }
        return adj;
    }

    void addEdge(Map<Integer, List<Integer>> adj, int v, int w) {

        if (adj.containsKey(v)) {
            adj.get(v).add(w);

        } else {
            adj.put(v, new ArrayList<Integer>());
            adj.get(v).add(w);
        }

        if (adj.containsKey(w)) {
            adj.get(w).add(v);

        } else {
            adj.put(w, new ArrayList<Integer>());
            adj.get(w).add(v);
        }
    }
}