import java.util.*;

public class Program
{
static int fact( int x){
if(x==0){
    return 1;
}else
 return (x*fact(x-1));
 
    }

static  int perm(int N,int r){
    int sonc=fact(N)/(fact(r)*fact(N-r));
    return sonc ;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rr=sc.nextInt();
        if(rr>=n||n<=00||rr<=0){
            System.out.println("Hata");
        }else{ 
        
     int ss = perm(n, rr);
     
        System.out.println(ss);
        }
    }
}
