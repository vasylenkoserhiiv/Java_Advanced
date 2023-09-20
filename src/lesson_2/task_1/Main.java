package lesson_2.task_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        //Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++){
            System.out.print("Введіть слово #" + (i + 1) + ": ");
            String word = null;
            try {
                word = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            words.add(word);
        }
        System.out.println("Original: ");
        for (String temp : words) {
            System.out.print(temp + " ");
        }
        System.out.println();
        doubleValue(words);
//        System.out.println(words);
        System.out.println("Changed with doubleValue() method");
        for (String temp : words){
            System.out.print(temp + " ");
        }
    }

    public static void doubleValue(ArrayList<String> list){
        int originalSize = list.size();
        for (int i = 0; i < originalSize * 2; i++) {
            String word = list.get(i);
            list.add(i + 1, word);
            i++;
        }
    }
}
