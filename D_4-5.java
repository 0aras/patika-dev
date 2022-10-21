import java.util.*;

public class Program
{
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
     int sum=0;
     int t=3;
    int sy=sc.nextInt();
   if(sy<4){System.out.println("4 ve 5 e bölümem sayı yok");
   }else{ 
   
    
    while(t<=sy){
       if(t%4==0 && t%5==0) {
           sum+=t;
       }
       t++;
    }
       } 
    System.out.println(sum);
    }
}
