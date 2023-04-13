package Домашка.Seminar_4;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,3,2,1));
        boolean res = false;
        for (int i = 0; i < deque.size()/2; i++) {
            if (deque.pollFirst()==deque.pollLast()) {
                res = true;
                break;
            }
        }
        if (res==true) {
            System.out.println("Polindrom");
        }
        else {
            System.out.println("Not polindrom");
        //System.out.println(res ? "Polindrom" : "Not polindrom");
        }
        }
    }
