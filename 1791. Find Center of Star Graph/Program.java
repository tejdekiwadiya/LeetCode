// https://leetcode.com/problems/find-center-of-star-graph/description/

public class Program {
    public static void main(String[] args) {
        int[][] edges = { { 1, 2 }, { 2, 3 }, { 4, 2 } };
        int ans = findCenter(edges);
        System.out.println(ans);
    }

    public static int findCenter(int[][] edges) {
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1])
            return edges[0][0];
        else
            return edges[0][1];
    }
}