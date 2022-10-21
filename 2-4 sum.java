import java.util.*;

public class Program
{
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
     
      int sum=0; 
      int m=1;
     while(m>0){ 
     m=sc.nextInt();
      if(m%2==0&&m%4==0){  
        sum+=m;
    }
    
    }
    System.out.println(sum);
    }
}
