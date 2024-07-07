// https://leetcode.com/problems/count-of-matches-in-tournament/description/

public class Program {
    public static void main(String[] args) {
        int n = 14;
        int ans = numberOfMatches(n);
        System.out.println(ans);
    }

    public static int numberOfMatches(int n) {
        int ans = 0;
        int team = n;
        while (team != 1) {
            if (team % 2 == 0) {
                team = (team / 2);
                ans += team;
            } else {
                team = (team / 2);
                ans += team;
                team += 1;
            }
        }
        return ans;
    }
}
