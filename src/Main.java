import javax.print.Doc;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("LOGIN PAGE");
        loginFactory lf = new loginFactory();
        loginPage lp = loginPage.getInstance();
        System.out.println("Whom data you want to view? (Doctor or Patient): ");
        String choice = sc.nextLine();
        switch(choice){
            case "Patient":
                Login Patient = lf.getInstance("Patient");
                lp.loginDisplay();
                Patient.setCredentials(lp.getUsername(),lp.getPassword());
                Patient.dashboard();
                break;
            case "Doctor":
                Login Doctor = lf.getInstance("Doctor");
                lp.loginDisplay();
                Doctor.setCredentials(lp.getUsername(),lp.getPassword());
                Doctor.dashboard();
                break;
            default:
                System.out.println("No such choice available.");
        }
    }

}
