package WS_7;

/**
 * Patient class inherits from Person
 */
public class Patient extends Person {
    private int patientID;

    /** Book an appointment with a doctor */
    public void bookAppointment(Doctor doctor, Appointment appointment) {
        System.out.println(name + " booked an appointment with Dr. " + doctor.getName() +
                " on " + appointment.getAppointmentDate() + " at " + appointment.getAppointmentTime());
    }

    // Getter & Setter for patientID
    public int getPatientID() { return patientID; }
    public void setPatientID(int patientID) { this.patientID = patientID; }
}
