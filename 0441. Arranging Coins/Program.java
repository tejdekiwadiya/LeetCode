// https://leetcode.com/problems/arranging-coins/description/

public class Program {
    public static void main(String[] args) {
        int n = 8;
        int ans =  arrangeCoins(n);
        System.out.println(ans);
    }

    public static int arrangeCoins(int n) {
        int i = 0;
        while(n>0 && n > i){
            i++;
            n = n - i;
        }
        return i;
    }
}
