package dump;
import java.util.*;
public class NameSplit {
    public static String[] splitString(String s) {
        int n = s.length();
        int part1 = n / 3 + (n % 3 > 0 ? 1 : 0);
        int part3 = n / 3 + (n % 3 == 2 ? 1 : 0);
        int part2 = n - part1 - part3;
        String front = s.substring(0, part1);
        String middle = s.substring(part1, part1 + part2);
        String end = s.substring(part1 + part2);
        return new String[]{front, middle, end};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        sc.close();
        String[] p1 = splitString(s1);
        String[] p2 = splitString(s2);
        String[] p3 = splitString(s3);
        System.out.println(p1[0] + " " + p1[1] + " " + p1[2]);
        System.out.println(p2[0] + " " + p2[1] + " " + p2[2]);
        System.out.println(p3[0] + " " + p3[1] + " " + p3[2]);
    }
}
