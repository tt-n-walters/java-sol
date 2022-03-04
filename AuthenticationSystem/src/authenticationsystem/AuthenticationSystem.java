
package authenticationsystem;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class AuthenticationSystem {

    public static void main(String[] args) {
        User user = null;

        File dataFile = new File("src/authenticationsystem/data.txt");
        try {
            Scanner dataInput = new Scanner(dataFile);
            String data = dataInput.nextLine();
            String[] dataPieces = data.split(":::");
            System.out.println("Successfully read data file.");
            user = new User(dataPieces[0], dataPieces[1], Integer.parseInt(dataPieces[2]));

        } catch(FileNotFoundException e) {
            System.out.println("Data file doesn't exist.");
        }

        if (user != null) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter username:");
            String inputUsername = input.nextLine();
            System.out.println("Enter password:");
            String inputPassword = input.nextLine();

            if (user.getName().equals(inputUsername) && user.getPassword().equals(inputPassword)) {
                System.out.println("Successfully logged in.");
            } else {
                System.out.println("Incorrect username or password.");
            }
        }
    }
}
