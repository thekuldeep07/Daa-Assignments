package dfs;

import com.sun.tools.internal.xjc.reader.gbind.Graph;

import java.util.*;
import java.util.Scanner;

public class DFS {
    private LinkedList<Integer>adj[];
    public DFS(int v){
        adj = new LinkedList[v];
        for(int i=0; i<v; i++){
            adj[i] = new LinkedList<Integer>();
        }
    }
    public void addEdge(int source, int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }
    private boolean dfsUtil(int source, int destination, boolean vis[]){
        if (source == destination) return true;
        for (int neighbor:adj[source]){
            if (!vis[neighbor]){
                vis[neighbor] = true;
                boolean isConnected = dfsUtil(neighbor, destination, vis);
                if (isConnected) return true;
            }
        }
        return false;
    }
    public boolean dfs(int source, int destination){
        boolean vis[] = new boolean[adj.length];
        vis[source] = true;
        return dfsUtil(source, destination, vis);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of vertices and edges");
        int v = sc.nextInt();
        int e = sc.nextInt();
        DFS dfs = new DFS(v);
        System.out.println("Enter"+" "+ e +" "+"edges");
        for (int i=0; i<e; i++){
            int source = sc.nextInt();
            int destination = sc.nextInt();
            dfs.addEdge(source,destination);
        }
        System.out.println("Enter source and destination : ");
        int source = sc.nextInt();
        int destination = sc.nextInt();
        System.out.println("Possible"+" "+ dfs.dfs(source,destination));
    }
}
