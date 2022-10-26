import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userN,pasword;


        int count=3;
        int bakiye=1500;
        int sec;
        int chck=1;
        while(count>0){
            System.out.println("Kullanıcı adınız? ");
            userN=sc.nextLine();
            System.out.println ("Lütfen şifrenizi giriniz");
            pasword=sc.nextLine();
            if(userN.equals("patika")&&pasword.equals("dev123")){
                System.out.println("1: Para Yatırma \n"+"2: Para çekme\n"+"3:Bakiye Sorgulama \n"+"4:Çıkış Yap ");
                sec=sc.nextInt();
                switch (sec){
                    case 1:
                        System.out.println("Para miktarı : ");
                        int price =sc.nextInt();
                        bakiye+=price;
                        System.out.println("Çıkış yapmak istiyormusunuz ? çıkış için 0 Basınız");
                        chck=sc.nextInt();
                        if(chck==0) {
                            count=0;
                        }
                        break;
                    case 2:
                        System.out.println("Para miktarı : ");
                        int pri=sc.nextInt();
                        if(pri>bakiye){
                            System.out.println("Bakiye yetersiz");

                        }else{
                            bakiye-=pri;
                        }
                        System.out.println("Çıkış yapmak istiyormusunuz ? çıkış için 0 Basınız");
                        chck=sc.nextInt();
                        if(chck==0) {
                            count=0;
                        }
                        break ;
                    case 3:
                        System.out.println("Para miktarı : "+ bakiye);
                        System.out.println("Çıkış yapmak istiyormusunuz ? çıkış için 0 Basınız");
                        chck=sc.nextInt();
                        if(chck==0) {
                        count=0;
                        }

                        break ;
                    case 4:
                        System.out.println("Hoşçakalın ");
                        System.out.println("Çıkış yapmak istiyormusunuz ? çıkış için 0 Basınız");
                        if(sc.nextInt()==0) {
                            count=0;
                        }

                        break;
                    default :
                        break ;
                }

            }else{
                System.out.println("Yanlış kullanıcı adı veya şifre girdiniz ");
                count--;
                System.out.println("Kalan Hakkınız :"+count);
            }

        }
        if(count<1) {
            System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz ");
        }
    }
}
