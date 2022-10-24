import java.util.*;
public class Harmonik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 1;

        for (int i = 1; i <= n; i++) {
            sum += 1 / (double) i;
        }
        System.out.println(sum);
    }
}

