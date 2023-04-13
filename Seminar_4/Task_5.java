package Домашка.Seminar_4;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String n = iScanner.nextLine();
        Deque<String> str = new ArrayDeque<>();
        boolean res = true;

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch == '(') {
                str.push(")");
            }
            else if (ch == '{') {
                str.push("}");
            }
            else if (ch == '[') {
                str.push("]");
            }
            else {
                if (ch != str.pop().charAt(0)) {
                    res = false;
                    break;
            }
        }
    }
    System.out.println(str);
    iScanner.close();
    System.out.println(res ? "ok" : "Not ok");
    }
}
