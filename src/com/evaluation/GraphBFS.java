package com.evaluation;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class GraphBFS {
    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists

    // Constructor
    GraphBFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    boolean BFS(int s, int k) {
        boolean[] visited = new boolean[V];

        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.offer(s);

        while(!queue.isEmpty()) {

            s = queue.poll();

            final ListIterator<Integer> listIterator = adj[s].listIterator();
            while(listIterator.hasNext()) {
                int n = listIterator.next();

                if(n == k) {
                    return true;
                }

                if(!visited[n]) {
                    visited[n] = true;
                    queue.offer(n);
                }
            }
        }

        return false;
    }

    boolean DFS(int s, int k) {
        boolean[] visited = new boolean[V];
        return hasDFSPath(s, k, visited);
    }

    private boolean hasDFSPath(int s, int k, boolean[] visited) {
        if(visited[s]) {
            return false;
        }
        visited[s] = true;
        if(s == k) {
            return true;
        }
        for(int child : adj[s]) {
            if(hasDFSPath(child, k, visited)) {
                return true;
            }
        }
        return false;
    }

    // Driver method to
    public static void main(String args[])
    {
        GraphBFS g = new GraphBFS(9);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.addEdge(4, 5);
        g.addEdge(4, 6);
        g.addEdge(5, 7);

        System.out.println("Following is Breadth First Traversal "+
                                   "(starting from vertex 2)");
        System.out.println(g.BFS(2, 0));
        System.out.println(g.DFS(2, 0));

        System.out.println("Following is Breadth First Traversal "+
                                   "(starting from vertex 2)");
        System.out.println(g.BFS(2, 4));
        System.out.println(g.DFS(2, 4));

        System.out.println("Following is Breadth First Traversal "+
                                   "(starting from vertex 2)");
        System.out.println(g.BFS(4, 7));
        System.out.println(g.DFS(4, 7));

        System.out.println("Following is Breadth First Traversal "+
                                   "(starting from vertex 2)");
        System.out.println(g.BFS(6, 7));
        System.out.println(g.DFS(6, 7));
    }
}