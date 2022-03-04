
package authenticationsystem;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class AuthenticationSystem {

    public static void main(String[] args) {
        String[] username;
        String[] password;
        String[] years;

        File dataFile = new File("src/authenticationsystem/data.txt");
        try {
            Scanner dataInput = new Scanner(dataFile);
            String data = dataInput.nextLine();
            String[] dataPieces = data.split(":::");
            System.out.println("Successfully read data file.");
            username = dataPieces[0];
            password = dataPieces[1];

        } catch(FileNotFoundException e) {
            System.out.println("Data file doesn't exist.");
            username = "";
            password = "";
        }


        Scanner input = new Scanner(System.in);
        System.out.println("Enter username:");
        String inputUsername = input.nextLine();
        System.out.println("Enter password:");
        String inputPassword = input.nextLine();
        
        if (username.equals(inputUsername) && password.equals(inputPassword)) {
            System.out.println("Successfully logged in.");
        } else {
            System.out.println("Incorrect username or password.");
        }
    }
}
