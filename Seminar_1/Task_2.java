package Домашка.Seminar_1;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("n: ");
        int n = iScanner.nextInt();

        int [] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ое: ",i+1);
            array[i] = iScanner.nextInt();
        }
        System.out.printf("m: ");
        int m = iScanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * m;
            System.out.println(array[i]);
        }
        iScanner.close();

    }
}
