import java.util.Scanner;

public class pharmacyAdapter implements Pharmacy{
    private Medicines medicines;
    public pharmacyAdapter(String medCategory){
        if(medCategory.equalsIgnoreCase("flu")){
            medicines = new fluMeds();
        }
        else if(medCategory.equalsIgnoreCase("blood pressure")){
            medicines = new bloodPressureMeds();
        }
        else{
            medicines = new stomachPainMeds();
        }
    }

    @Override
    public void displayAvailableMedicines() {
        medicines.medInfo();
        System.out.println("enter medicine name: ");
        Scanner sc = new Scanner(System.in);
        String medName = sc.nextLine();
        medicines.purchaseMed(medName);

    }

}
