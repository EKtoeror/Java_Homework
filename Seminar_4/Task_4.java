package Домашка.Seminar_4;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Task_4 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        LinkedList<Integer> list = new LinkedList<Integer>();
        String str = new String();
        String str1 = new String();
        int d1Size = d1.size();
        int d2Size = d2.size();
        for (int index = 0; index < d1Size; index++) {
            str += d1.pollLast();
        }
        for (int i = 0; i < d2Size; i++) {
            str1 += d2.pollLast();
        }

        int summ = Integer.parseInt(str) + Integer.parseInt(str1);

        while (summ > 0 ) {
            list.add(summ%10);
            summ = summ/10;
        }
        System.out.println(list);
    }
}
