package org.example;


import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String text) {
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversedText = new StringBuilder(cleanText).reverse().toString();
        return cleanText.equals(reversedText);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome tekshiruvchi dastur");
        System.out.print("So'z yoki jumlani kiriting: ");
        String input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println("Bu matn palindrome!");
        } else {
            System.out.println("Bu matn palindrome emas.");

        }

        scanner.close();
    }
}