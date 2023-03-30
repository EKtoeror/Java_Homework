package Домашка.Seminar_1;
import java.util.Scanner;

/**
 * Task_1
 */
public class Task_1 {

    public static void main(String[] args) {
        int [] array = new int[1000];
        for (int i = 1; i < array.length; i++) {
            array[i] = i*i*i;
            // System.out.println(array[i]);
        }
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("n1: ");
        int n1 = iScanner.nextInt();
        System.out.printf("n2: ");
        int n2 = iScanner.nextInt();
        iScanner.close();
        System.out.println(array[n1]);
        System.out.println(array[n2]);
        }
        }
