package com.test;

import java.util.Scanner;

public class VowelChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");

        String inputString = scanner.nextLine();

        int vowelCount = countVowels(inputString);

        if (vowelCount > 0 ){
            System.out.println("No of Vowels: "+ vowelCount);
        }else {
            System.out.println("No Vowels are found");
        }
    }

    public static int countVowels(String str){
        int count = 0;
        String vowels = "AEIOUaeiou";

        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1){
                count++;
            }
        }
        return count;
    }
}
