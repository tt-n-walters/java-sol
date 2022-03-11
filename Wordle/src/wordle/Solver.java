package wordle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Solver {
    
    private Scanner input;
    private ArrayList<String> words;
    
    public Solver() {
        words = new ArrayList<>();
        
        try {
            File file = new File("src/wordle/words.txt");
            input = new Scanner(file);
            
            while (input.hasNext()) {
                String word = input.nextLine();
                if (word.length() == 5) {
                    words.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Words file not found.");
        }
        
        System.out.println(String.format("Read %d words from file.", words.size()));
    }
    
    public ArrayList<String> search(char[] letters) {
        ArrayList<String> matches = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            boolean isMatch = true;
            
            for (int j = 0; j < 5; j++) {
                // Check if the letter is not an underscore, if not, compare to
                // the approriate letter of the word
                char letter = letters[j];
                char wordLetter = word.charAt(j);
                if (letter != '_' && wordLetter != letter) {
                    isMatch = false;
                }
            }
            
            if (isMatch) {
                matches.add(word);
            }
        }
        return matches;
    }
}
