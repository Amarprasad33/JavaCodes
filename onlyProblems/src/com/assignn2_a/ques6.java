package com.assignn2_a;
import java.util.*;
public class ques6 {
    static class graph{
        int V;
        LinkedList<Integer> adj[];
        graph(int v)
        {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj[i] = new LinkedList();
        }

        void addEdge(int v, int w)
        {
            adj[v].add(w);
        }

        void dfsutil(int v, boolean visited[]) {
            visited[v] =true;
            System.out.println(v +" ");

            Iterator<Integer>  i = adj[v].listIterator();
            while(i.hasNext()) {
                int n =i.next();
                if(!visited[n])
                    dfsutil(n ,visited);
            }
        }

        void DFS(int v) {
            boolean visited[] =new boolean[V];
            dfsutil(v ,visited);
        }
    }

    public static void main(String[] args) {
        graph g = new graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal " + "(starting from vertex 1)");

        g.DFS(1);

    }

}
