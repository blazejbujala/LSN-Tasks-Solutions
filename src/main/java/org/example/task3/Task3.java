package org.example.task3;

import java.util.*;

class Task3 {
    int V;

    LinkedList<Integer>[] adj;

    Task3(int V) {
        this.V = V;
        adj = new LinkedList[V];

        for (int i = 0; i < adj.length; i++)
            adj[i] = new LinkedList<Integer>();

    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFS(int n, boolean visited[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(n);
        int a = 0;
        while (!stack.empty()) {
            n = stack.peek();
            stack.pop();
            if (!visited[n]) {
                visited[n] = true;
            }

            for (int i = 0; i < adj[n].size(); i++) {
                a = adj[n].get(i);
                if (!visited[a]) {
                    stack.push(a);
                }
            }
        }
    }

    void connectedComponents() {
        boolean[] visited = new boolean[V];
        int counter = 0;
        for (int v = 0; v < V; ++v) {
            if (!visited[v] && !adj[v].isEmpty()) {
                DFS(v, visited);
                counter++;
            }
        }
        System.out.println(counter);
    }
}