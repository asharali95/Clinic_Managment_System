import java.util.Scanner;

public class Patient implements Login{
    static Scanner sc = new Scanner(System.in);

    private String username;
    private String password;

    public void setId(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setCredentials(String username, String password) {
        setId(username);
        setPassword(password);
    }
    @Override
    public void dashboard(){
        System.out.println("welcome to patient dashboard");
        System.out.println("1. Appointment\n2. Pharmacy\n3. logout");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                AppointmentNullObject appointment = new AppointmentNullObject();
                appointment.show();
        }
    }
}
