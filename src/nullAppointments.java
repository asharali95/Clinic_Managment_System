public class nullAppointments extends Appointment{
    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public String getAppointment() {
        return null;
    }
}
