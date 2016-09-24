/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author madhavadabare
 */
class Edge implements Comparable<Edge> {

    int src, dest, weight;

        // Comparator function used for sorting edges based on
    // their weight
    public int compareTo(Edge compareEdge) {
        return this.weight - compareEdge.weight;
    }
};
