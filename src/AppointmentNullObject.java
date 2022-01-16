import javax.print.Doc;
import java.util.Scanner;

public class AppointmentNullObject {
    static Scanner sc = new Scanner(System.in);
    String[] doctors = {"rafay","mukadus","abdullah","ashar"};
    String[] expertise = {"dermatologist","cardiologist","nutritionist","psychiatrist"};
    String[] days = {"Mon,Tues,Fri","Tues,Thurs","Mon,Friday","Tues"};
    private void display(){
        System.out.println("Doctors\t\tExpertise\t\tAvailable Day");
        for(int i=0; i<doctors.length&&i<expertise.length;i++){
            System.out.println(doctors[i]+"\t\t"+expertise[i]+"\t\t"+days[i]);
        }
    }
    private Appointment setAppointment(){
        System.out.println("Select Doctor for appointment:");
        String docName = sc.nextLine();
        DocAppointments docAppoint;
        for(String doct: doctors) {
            if (doct.equalsIgnoreCase(docName)) {
                docAppoint = new DocAppointments();
                docAppoint.setDocName(docName);
                return docAppoint;
            }
            else{
                continue;
            }
        }
        return new nullAppointments();
    }
    public void show() {
        display();
//       setting appointment
            System.out.println(setAppointment().getAppointment());
    }
}
