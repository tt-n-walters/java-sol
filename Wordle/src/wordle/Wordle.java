package wordle;

import java.util.ArrayList;

public class Wordle {
    
    public static void main(String[] args) {
        Solver solver = new Solver();
        
        char[] letters = {'s', '_', 'e', 'e', 't'};
        ArrayList<String> results = solver.search(letters);
        System.out.println(results.size());
        System.out.println(results);
    }
    
}
