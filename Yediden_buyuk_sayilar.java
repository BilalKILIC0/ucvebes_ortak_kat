// 7'den büyük tam sayılar (s >7), 3 ve 5 'in katları toplamı (3a + 5b = S) olarak yazılabilir. Girilen tam sayı için 3(a) ve 5'in (b) katlarını bulan program.
package yediden_buyuk_sayilar;
import java.util.Scanner;
/*
Adım 1: Başla
Adım 2: Kullanıcıdan bir n sayısı al
Adım 3: a yı 3 kere döndür
Adım 4: b yi 5 kere döndür
Adım 5: Eğer 3*a+5*b == girilen sayıya ekrana yazdır
Adım 6: Dur.
*/
public class Yediden_buyuk_sayilar {


    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Bir tam sayı giriniz :");
        int girilen = input.nextInt();
        
        for (int a =0; a<=3;a++) {
            
            for (int b =0; b<=5;b++) {
                if (3*a+5*b == girilen) {
                    System.out.println("Girilen sayı ="+girilen+" A sayısının katı = "+a+" B sayısnın katı = "+b);
                }
            } 
        }   
    }
}
