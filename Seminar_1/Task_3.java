package Домашка.Seminar_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String calc = iScanner.nextLine();
        String[] array = calc.split(" ");

        iScanner.close();
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[2]);
        int result = 0;
        switch (array[1]) {
            case "+":
                result = a + b;
                System.out.println(result);
                break;
            case "-":
                result = a - b;
                System.out.println(result);
                break;
            case "*":
                result = a* b;
                System.out.println(result);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("На ноль делить нельзя");
                }
                else{
                    result = a / b;
                    System.out.println(result);
                }
            default:
                break;

        }
        }
        }
