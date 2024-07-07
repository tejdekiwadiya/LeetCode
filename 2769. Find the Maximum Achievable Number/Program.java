public class Program {
    public static void main(String[] args) {
        int num = 8;
        int t = 2;
        int ans = theMaximumAchievableX(num, t);
        System.out.println(ans);
    }

    public static int theMaximumAchievableX(int num, int t) {
        for (int i = 0; i < t; i++) {
            if (num > -1) {
                num++;
            } else {
                num--;
            }
        }
        return num + t;
    }
}
