/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author madhavadabare
 */
public class main {

    public static void main(String[] args) {

        int V = 9;  // Number of vertices in graph
        int E = 14;  // Number of edges in graph
        int Cost[][] = {//source , destination , weight
            {1, 2, 3},
            {1, 7, 4},
            {2, 7, 2},
            {2, 3, 5},
            {2, 8, 3},
            {3, 8, 3},
            {3, 4, 4},
            {4, 8, 4},
            {4, 5, 3},
            {5, 9, 2},
            {6, 7, 2},
            {6, 4, 9},
            {7, 9, 6},
            {8, 9, 5}
        };

        Graph graph = new Graph(V, Cost);

        graph.KruskalMST();
    }
}
