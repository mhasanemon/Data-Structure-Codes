package com.company;


import java.lang.Integer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

class Main {
    static Scanner input = new Scanner(System.in);
    static Vector<Vector<Integer>> vectors = new Vector<>();
    static Queue<Integer> queue = new LinkedList<>();


    static int N, E;
    static String color[] = new String[100];
    static int prev[] = new int[100];
    static int f[] = new int[100];
    static int d[] = new int[100];
    static int time = 0;

    public static void main(String[] args) {

        System.out.println("Enter the number of nodes and edges:");

        N = input.nextInt();
        E = input.nextInt();

        for (int i = 0; i < N; i++)
            vectors.add(new Vector<>());

        for (int i = 0; i < E; i++) {
            int a, b;
            a = input.nextInt();
            b = input.nextInt();

            vectors.get(a).add(b);
        }


        for (int i = 0; i < N; i++) {
            color[i] = "white";
        }


        System.out.println("Following is Depth First Traversal (starting from vertex 0");

        for (int i = 0; i < N; i++) {
            if (color[i].equals("white")) {
                DFS(i);
            }
        }


        for (int i = 0; i < N; i++) {
            System.out.println("node " + i + " Starting time :" + d[i] + "finishing time: " + f[i]);
        }


        System.out.print("\n\n\n");
        System.out.println("The topological order is:");

        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }

 
        /*for(int i=0;i<N;i++){
            System.out.println(i+" " + vectors.get(i));
            System.out.println();
            for(int j=0;j<vectors.get(i).size();j++)
                System.out.println(vectors.get(i).get(j));
        }*/


    }

    static void DFS(int v) {
        color[v] = "grey";
        time++;
        d[v] = time;

        for (int j = 0; j < vectors.get(v).size(); j++) {
            int u = vectors.get(v).get(j);
            if (color[u].equals("white")) {
                prev[u] = v;
                DFS(u);
            }
        }
        color[v] = "black";
        time++;
        f[v] = time;
        queue.add(v);


    }

}