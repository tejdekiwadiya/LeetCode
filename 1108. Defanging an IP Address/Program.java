// https://leetcode.com/problems/defanging-an-ip-address/description/

public class Program {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String ans = defangIPaddr(address);
        System.out.println(ans);
    }

    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
