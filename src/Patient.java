import java.util.Scanner;

public class Patient implements Login,Medicines{
    static Scanner sc = new Scanner(System.in);
    private pharmacyAdapter pharmacyAdapter;
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
    // here I am using purchaseMed to get the med category type
    @Override
    public void selectmedCategory(String medCategory) {
        if(medCategory.equalsIgnoreCase("flu") || medCategory.equalsIgnoreCase("BP") || medCategory.equalsIgnoreCase("stomachache")){
            pharmacyAdapter = new pharmacyAdapter(medCategory);
            pharmacyAdapter.displayAvailableMedicines();
        }
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
                dashboard();
                break;
            case 2:
                System.out.println("1. flu\n2. BP\n3. stomachache");
                System.out.println("Enter category name: ");
                String category = sc.next();
                selectmedCategory(category);
                dashboard();
              break;
            case 3:
                System.exit(0);
        }
    }



//not necessary for this class
    @Override
    public void medInfo() {

    }
    @Override
    public void purchaseMed(String medType) {

    }

}
