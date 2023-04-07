package Домашка.Seminar_3;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        //List<Integer> list_2 = new ArrayList<>();
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 4, 1, 2, 6, 4, 3, 5, 7, 8, 0));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
            System.out.println(list);
        }
        System.out.println(list);
        }

    }

// есть ли другие варианты исполнения (желательно с кодом ,чтобы понятне было)
