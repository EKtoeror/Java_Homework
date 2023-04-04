package Домашка.Seminar_2;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s1 = iScanner.nextLine();
        System.out.println("Введите массив через запятую: ");
        String array = iScanner.nextLine();
        iScanner.close();

        char [] chars = s1.toCharArray();
        char [] chars2 = new char[chars.length];
        String [] indexArray = array.split(",");
        // String [] stringArray = s1.split("");
        Integer[] indexArray2 = Stream.of(indexArray).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        // iScanner.close();


        for (int i = 0; i < indexArray2.length; i++) {
            chars2[indexArray2[i]-1] = chars[i];
        }
        for (int i = 0; i < chars2.length; i++) {
            System.out.print(chars2[i]);
        }
        }
        }
