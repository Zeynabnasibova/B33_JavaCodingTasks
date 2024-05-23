package Olga.week_4;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        String letter1 = "car";
        String letter2 = "acr";
        checkLetters(letter1, letter2);
    }

    public static void checkLetters(String ex1, String ex2){
        char[] char1 = ex1.toCharArray();
        Arrays.sort(char1);
        char[] char2 = ex2.toCharArray();
        Arrays.sort(char2);
        System.out.println(Arrays.equals(char1, char2));
    }
}
