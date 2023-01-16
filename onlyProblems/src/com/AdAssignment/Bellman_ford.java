package com.AdAssignment;

public class Bellman_ford {

    public static void main(String[] args)
    {
        int V = 5;
        int E = 9;
        int graph[][] = {
                { 0, 1, 4},
                { 0, 2, 2 },
                { 1, 2, 3 },
                { 2, 1, 1 },
                { 1, 3, 2 },
                { 1, 4, 3 },
                { 2, 3, 4 },
                { 4, 3, -5},
                { 2, 4, 5 }  };

        BellmanFord(graph, V, E, 0);
    }

    static void BellmanFord(int graph[][], int V, int E, int src) {

        int[] Min_d = new int[V];
        for (int i = 0; i < V; i++)
            Min_d[i] = Integer.MAX_VALUE;

        Min_d[src] = 0;

        for (int i = 0; i < V - 1; i++)
        {
            for (int j = 0; j < E; j++)
            {
                if (Min_d[graph[j][0]] != Integer.MAX_VALUE && Min_d[graph[j][0]] + graph[j][2] <
                        Min_d[graph[j][1]])
                    Min_d[graph[j][1]] =
                            Min_d[graph[j][0]] + graph[j][2];
            }
        }
        for (int i = 0; i < E; i++)
        {
            int x = graph[i][0];
            int y = graph[i][1];
            int weight = graph[i][2];
            if (Min_d[x] != Integer.MAX_VALUE && Min_d[x] + weight < Min_d[y])
                System.out.println("Graph contains negative" +" weight cycle");
        }

        System.out.println("        Minimum Vertex Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + "\t\t" + Min_d[i]);
    }


}
