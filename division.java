import java.util.*;


public class Program
{

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int d=(sc.nextInt());
   int m=0;
 for(int i=3;i<=d;i++){
    if(i%3==0 && i%4==0){
     m+=i;   
    }
     
 }
   System.out.println(d+" Bölünenlerin toplamı");
    }
}
