import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayi Giriniz: ");
        printCommandLine(scn.nextFloat());
    }

    public static void printCommandLine(float number){
        System.out.print("Aşağı Yuvarlama: " + Math.floor(number) + "\n" +
                "Yukari Yuvarlama: " + Math.ceil(number) + "\n" +
                "En Yakın Tam Sayı: " + Math.round(number));
    }
}
