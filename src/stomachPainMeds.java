import java.util.ArrayList;

public class stomachPainMeds implements Medicines {
    private ArrayList<String> medList = new ArrayList<String>();
    private void updateMedList(){
        String medListArr[] = {"Imodium","Liquiprin","Tylenol","Pepto Bismol"};
        for(String med: medListArr){
            medList.add(med);
        }
    }
    public stomachPainMeds(){
        updateMedList();
    }
    @Override
    public void medInfo() {
        int i=0;
        for(String med: medList){
            System.out.println(i+1+"- "+med);
        }
    }

    @Override
    public void purchaseMed(String med) {
        boolean flag = false;
        for(String medicine: medList){
            if(medicine.equalsIgnoreCase(med)){
                System.out.println("you've purchased "+med);
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("this med is not currently available");
        }
        System.out.println("Thankyou");

    }
    @Override
    public void selectmedCategory(String medCategory) {
    }
}
