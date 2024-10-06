// https://leetcode.com/problems/check-if-two-chessboard-squares-have-the-same-color/

public class Program {
    public static void main(String[] args) {
        String coordinate1 = "a1";
        String coordinate2 = "c3";
        boolean ans = checkTwoChessboards(coordinate1, coordinate2);
        System.out.println(ans);
    }
    public static boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int coordinate1Y = Integer.parseInt(String.valueOf(coordinate1.charAt(1)));
        int coordinate2Y = Integer.parseInt(String.valueOf(coordinate2.charAt(1)));
        char coordinate1X = coordinate1.charAt(0);
        char coordinate2X = coordinate2.charAt(0);

        boolean b1 = (coordinate1Y % 2 == 1 && coordinate2Y % 2 == 1)
                || (coordinate1Y % 2 == 0 && coordinate2Y % 2 == 0);

        boolean b2 = (coordinate1Y % 2 == 0 && coordinate2Y % 2 == 1)
                || (coordinate1Y % 2 == 1 && coordinate2Y % 2 == 0);

        if (coordinate1X == 'a' || coordinate1X == 'c' || coordinate1X == 'e' || coordinate1X == 'g') {
            if (coordinate2X == 'b' || coordinate2X == 'd' || coordinate2X == 'f' || coordinate2X == 'h') {
                if (b2) {
                    return true;
                }
            } else if (coordinate2X == 'a' || coordinate2X == 'c' || coordinate2X == 'e' || coordinate2X == 'g') {
                if (b1) {
                    return true;
                }
            }
        } else if (coordinate1X == 'b' || coordinate1X == 'd' || coordinate1X == 'f' || coordinate1X == 'h') {
            if (coordinate2X == 'a' || coordinate2X == 'c' || coordinate2X == 'e' || coordinate2X == 'g') {
                if (b2) {
                    return true;
                }
            } else if (coordinate2X == 'b' || coordinate2X == 'd' || coordinate2X == 'f' || coordinate2X == 'h') {
                if (b1) {
                    return true;
                }
            }
        }

        return false;
    }
}
