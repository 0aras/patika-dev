import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      int u=sc.nextInt();
      int sonc=0;
      if(u==0 ){
       System.out.println(sonc) ;  
      }else if(t==0){
       System.out.println(1);  
      }else if(t==1){
         System.out.println(t);
      
      for(int i=0;i<u;i++){
          t*=t;
      }
     System.out.println(t) ;
     }
    
    }
}
