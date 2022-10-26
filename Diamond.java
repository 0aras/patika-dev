import java.util.Scanner;
public class Program
{
static void pd(int x){

    for(int i=x;i>0; i--){ 
    System.out.print("*");
    
    }
}

static void bos(int y){
    
    for(int i=y;i>0;i--){ 
    System.out.print(" ");
    
    }
    
}
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int z=sc.nextInt();
      int k=z;
      int s=0;
     for(int j=z;j>0;j--){
         bos(k);
         k--;
         pd((2*s+1));
         s++;
         System.out.println();
                 
     }
     int nn=1;
     for(int m=z-1;m>=0;m--){
         bos(nn);
         nn++;
         
            pd(2*m+1);
            
         System.out.println();
     }
    }
}
