
package authenticationsystem;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;


public class AuthenticationSystem {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();

        File dataFile = new File("src/authenticationsystem/data.txt");
        try {
            Scanner dataInput = new Scanner(dataFile);

            while (dataInput.hasNext()) {
                String data = dataInput.nextLine();
                String[] dataPieces = data.split(":::");

                User user = new User(dataPieces[0], dataPieces[1], Integer.parseInt(dataPieces[2]));
                users.add(user);
            }

        } catch(FileNotFoundException e) {
            System.out.println("Data file doesn't exist.");
        }

        System.out.println(String.format("Created %d user(s).", users.size()));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter username:");
        String inputUsername = input.nextLine();
        System.out.println("Enter password:");
        String inputPassword = input.nextLine();

        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getName().equals(inputUsername) && user.getPassword().equals(inputPassword)) {
                System.out.println("Successfully logged in.");
            } else {
                System.out.println("Incorrect username or password.");
            }
        }
    }
}
