import java.util.Scanner;
public class Cıftve4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        int toplam = 0;

        do{
            System.out.print("Bir Sayi Giriniz : ");
            n = input.nextInt();

            if(n % 4==0) {

                toplam +=n;



            }


        }

        while (n % 2==0);

        System.out.print("Girilen Sayilarin Toplami : " + toplam);

    }


}
