public class DocAppointments extends Appointment {

    public void setDocName(String docName){
        this.doctName = docName;
    }
    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public String getAppointment() {

        if(doctName.equalsIgnoreCase("rafay") && isAvailable()) {
            return "Appointment set with Dr."+doctName;
        }
        else if(doctName.equalsIgnoreCase("abdullah") && isAvailable()) {
            return "Appointment set with Dr."+doctName;
        }
        else if(doctName.equalsIgnoreCase("muqakus")&& isAvailable()) {
            return "Appointment set with Dr."+doctName;
        }
        else if(doctName.equalsIgnoreCase("ashar")&& isAvailable()) {
            return "Appointment set with Dr."+doctName;
        }
        else {
            return "Dr."+doctName+"is unavailable";
        }

    }
}
