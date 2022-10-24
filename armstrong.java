import java.util.*;

public class Arms {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int veri= sc.nextInt();

        String verii=String.valueOf(veri);

        int t=verii.length();
        double multi=10;
        int sum=0;

        for (int i=0;i<t;i++){
            double bs=Integer.valueOf(String.valueOf(verii.charAt(i)));
            sum+=Math.pow(bs,(double)t );
            System.out.println(bs);
        }
        if (sum==veri){
            System.out.println(veri+" is a Armstrong number");
        }else{
            System.out.println(veri+" is not Armstrong number");
        }
    }
}
