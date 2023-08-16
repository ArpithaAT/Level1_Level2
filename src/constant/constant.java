package constant;

import java.util.Scanner;

public class constant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase(); 

        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                }
                else {
                    consonant++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowel);
        System.out.println("Number of consonants: " + consonant);
    }
}
