package string_manipulation;

//5. Write a program that will count how many vowels in the given string:
//        "roadtosdet"
//        Output: 4

public class Find_vowel_Letter_05 {
    public static void main(String[] args) {
        String word = "roadtosdet";
        int count = 0;
        for (int i = 0; i<word.length();i++){
            Character ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println( "Total vowel " +count);

    }
}

