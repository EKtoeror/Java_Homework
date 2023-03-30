package Домашка.Seminar_1;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите пропуски в уравнении точкой");
        String eqution = iScanner.nextLine();
        String [] array = eqution.split(" ");

        String [] arg1 = array[0].split("");
        var x1 = arg1[0];
        var y1 = arg1[1];


        String [] arg2 = array[2].split("");
        int x2 = Integer.parseInt(arg2[0]);
        int y2 = Integer.parseInt(arg2[1]);

        String [] arg3 = array[4].split("");
        int x3 = Integer.parseInt(arg3[0]);
        int y3 = Integer.parseInt(arg3[1]);

        int result = y3 - y2;
        System.out.println(result);

        iScanner.close();
        }
        // int x = Integer.parseInt(array[0]);
        // int y = Integer.parseInt(array[2]);
        // int z = Integer.parseInt(array[4]);


        //
    }
        // не успел сделать,в общем я хотел разделить все на строки,перевести в числа и после решения вывести на экран
