/*
Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pi=3.14, r, a, c, dda;

        System.out.println("Dairenin alan ve çevresini hesaplamak için yarıçapı giriniz : ");
        Scanner inp= new Scanner(System.in);
        r = inp.nextDouble();

        c = 2 * pi * r;
        a = pi * r * r;
        System.out.println(r+" yarıçaplı dairenin çevresi : "+c+" birim, alanı :"+a+" birim karedir.");

        System.out.println("Daire diliminin alanını hesaplamak için yarıçapı giriniz : ");
        r = inp.nextDouble();
        System.out.println("Daire diliminin merkez açı ölçüsünü giriniz : ");
        dda= inp.nextDouble();
        a = pi * r * r * dda/360;
        System.out.println(r+" yarıçap ve"+ dda + "derece daire diliminin alanı :"+a+" birim karedir.");


    }
}