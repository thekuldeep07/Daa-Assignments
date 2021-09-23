package bipartite;

import java.util.*;


class Edge
{
    int source, dest;

    public Edge(int source, int dest)
    {
        this.source = source;
        this.dest = dest;
    }
}

class Graph {
    List<List<Integer>> adjList = null;

    Graph(List<Edge> edges, int N)
    {
        adjList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            adjList.add(new ArrayList<>());
        }

        for (Edge edge: edges)
        {
            int src = edge.source;
            int dest = edge.dest;
            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }
    }
}

public class Bipartite {

    public static boolean BFS(Graph graph, int v, int N)
    {
        boolean[] discovered = new boolean[N];
        int[] level = new int[N];
        discovered[v] = true;
        level[v] = 0;
        Queue<Integer> q = new ArrayDeque<>();
        q.add(v);
        while (!q.isEmpty()) {
            v = q.poll();
            for (int u: graph.adjList.get(v)) {
                if (!discovered[u]) {
                    discovered[u] = true;
                    level[u] = level[v] + 1;
                    q.add(u);
                }
                else if (level[v] == level[u]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        List<Edge> edges = Arrays.asList(
                new Edge(1, 2), new Edge(2, 3), new Edge(2, 8),
                new Edge(3, 4), new Edge(4, 6), new Edge(5, 7),
                new Edge(5, 9), new Edge(8, 9)
        );
        final int N = 10;
        Graph graph = new Graph(edges, N);
        if (BFS(graph, 1, N)) {
            System.out.println("The graph is bipartite");
        }
        else {
            System.out.println("The graph is not bipartite");
        }
    }
}

