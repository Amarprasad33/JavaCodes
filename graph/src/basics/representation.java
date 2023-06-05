package basics;
import java.util.*;
public class representation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Undirected Graph maybe
        // Graph Nodes are from 0 to n-1
        int[][] gr = new int[n][n];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            gr[u][v] = 1;
            gr[v][u] = 1;
        }

    }
}
