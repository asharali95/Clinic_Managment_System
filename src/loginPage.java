import java.util.Scanner;

public class loginPage {
    Scanner sc = new Scanner(System.in);
    private String username;
    private String password;
    private static loginPage lp = new loginPage();
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    private void setUsername(String username) {
        this.username = username;
    }

    private void setPassword(String password) {
        this.password = password;
    }
    private loginPage(){}
    public static loginPage getInstance() {
        return lp;
    }
    public void loginDisplay(){
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        setUsername(username);
        setPassword(password);

    }

}
