public class loginFactory {
    public Login getInstance(String instanceCategory) {
        if(instanceCategory == null) {
            return null;
        }
        else if(instanceCategory.equalsIgnoreCase("patient")) {
            return new Patient();
        }
        else if(instanceCategory.equalsIgnoreCase("doctor")) {
            return new Doctor();
        }
        return null;
    }
}
