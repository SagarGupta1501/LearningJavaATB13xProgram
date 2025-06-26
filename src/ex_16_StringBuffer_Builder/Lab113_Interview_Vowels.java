package ex_16_StringBuffer_Builder;

public class Lab113_Interview_Vowels {

    public static void main(String[] args) {

        // count no of vowels and consonant

        String input = "Java program to count vowels and consonant";

        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase();
        System.out.println(input);

        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i'){
                vowels++;

            }else {
                consonants++;
            }
        }

        System.out.println("No of vowels " + vowels);
        System.out.println("No of consonants " + consonants);



    }
}

