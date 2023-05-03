
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = (int)(Math.random()*100);
        Scanner input = new Scanner(System.in);
        int selected;
        int[] wrongGuess = new int [5];
        boolean isWin = false;

        for (int right = 0; right < 5; right++) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = input.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz: ");
                continue;
            }
            if (selected == number) {
                isWin = true;
                System.out.println("Tebrikler, doğru tahmin! " + "Tahmin ettiğiniz sayı: " + number);
                break;
            }
            else {
                System.out.println("Hatalı bir sayı girdiniz! ");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür. ");
                }
                else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür. ");
                }
                wrongGuess[right] = selected;
                System.out.println("[Kalan hakkınız: " + (4 - right) + "]");
            }
        }
        if (!isWin) {
            System.out.println("\nKaybettiniz!" + " Tahminleriniz: " + Arrays.toString(wrongGuess));
            System.out.println("Gizli numara şuydu: " + number);
        }
    }
}