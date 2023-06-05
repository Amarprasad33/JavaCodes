package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class reprAdjacencyList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Vertices
        int m = sc.nextInt();  // Edges

        // Graph Nodes are from 0 to n-1
        List<Integer>[] graph = new ArrayList[n];
        for(int i = 0; i < n; i++){
            graph[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u].add(v);
            graph[v].add(u);
        }
    }
}
