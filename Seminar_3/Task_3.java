package Домашка.Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 4, 1, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        //list.stream().mapToInt(a->a).average().orElse(0);
        double result = list.stream().mapToInt(a -> a).average().orElse(0);
        System.out.println(result);
    }
}
