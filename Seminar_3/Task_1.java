package Домашка.Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task_1 {
    /**
     *
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 4, 1, 2, 6, 4, 3, 5, 7, 8, 0));

        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i; j < list.size(); j++) {
                if (list.get(minIndex)>list.get(j)) {
                    minIndex = j;
                }
                if (minIndex != i) {
                    int temp = list.get(minIndex);
                    list.set(minIndex, list.get(i));
                    list.set(i, temp);
                }
            }
        }
        System.out.println(list);
    }
}
