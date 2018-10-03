package sigma.se;

import java.util.HashSet;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        HashSet<String> wordsSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        Boolean hasDuplicates = false;
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        for (String word : words) {

            if (!wordsSet.add(word))
                hasDuplicates = true;
        }
        if (hasDuplicates)
            System.out.println("no");
        else
            System.out.println("yes");
    }
}
