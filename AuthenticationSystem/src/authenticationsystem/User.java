
package authenticationsystem;

public class User {
    
    private String name;
    private String password;
    private int year;

    public User(String name, String password, int year) {
        this.name = name;
        this.password = password;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getYear() {
        return year;
    }
}
