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
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            int minIndex = i;
            for (int j = i; j < list.size(); j++) {
                if (list.get(j)<list.get(minIndex)) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {//вложить внутрь 2го цикла и начать от 0,будет по убыванию
                int temp = list.get(minIndex);
                list.set(minIndex, list.get(i));
                list.set(i, temp);

            }
        }
        System.out.println(list);
    }
}
