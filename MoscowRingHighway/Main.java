import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int s = 109;
        int v = sc.nextInt();
        int t = sc.nextInt();

        int res = ((v*t+s)%s)%s;

        System.out.println(res);

    }
}