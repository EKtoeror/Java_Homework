package Домашка.Seminar_5;
import java.util.Scanner;

import java.util.HashMap;

public class Task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        HashMap<String, String> phoneBook = new HashMap<String, String>();

        String input = iScanner.nextLine();
        String [] contact = input.split(" ");

        String name = contact[0];
        String phoneNumbers = "";

        for (int i = 0; i < contact.length; i++) {
            phoneNumbers +=contact[i] + ",";
        }
        phoneNumbers = phoneNumbers.substring(0, phoneNumbers.length()- 1);
        if (phoneBook.containsKey(name)) {
            String str = phoneBook.get(name);
            phoneBook.put(name, str + ", " +phoneNumbers);
        }
        else {
            phoneBook.put(name, phoneNumbers);
        }
        System.out.println();
        for (String nm : phoneBook.keySet()) {
            String phones = phoneBook.get(name);
            System.out.println(nm + ": " + phones);
        }
    iScanner.close();
    }

}
