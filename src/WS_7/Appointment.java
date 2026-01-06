package WS_7;

/**
 * Represents an appointment between a patient and a doctor
 */
public class Appointment {
    private int appointmentID;
    private String appointmentDate;
    private String appointmentTime;
    private Patient patient;
    private Doctor doctor;

    /** Reschedule appointment */
    public void rescheduleAppointment(String newDate, String newTime) {
        this.appointmentDate = newDate;
        this.appointmentTime = newTime;
        System.out.println("Appointment rescheduled to " + newDate + " at " + newTime);
    }

    /** Cancel appointment */
    public void cancelAppointment() {
        System.out.println("Appointment canceled.");
    }

    /** View appointment details */
    public void viewAppointmentDetails() {
        System.out.println("Appointment ID: " + appointmentID);
        System.out.println("Patient: " + patient.name);
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Date: " + appointmentDate);
        System.out.println("Time: " + appointmentTime);
    }

    // Getters & Setters
    public int getAppointmentID() { return appointmentID; }
    public void setAppointmentID(int appointmentID) { this.appointmentID = appointmentID; }
    public String getAppointmentDate() { return appointmentDate; }
    public void setAppointmentDate(String appointmentDate) { this.appointmentDate = appointmentDate; }
    public String getAppointmentTime() { return appointmentTime; }
    public void setAppointmentTime(String appointmentTime) { this.appointmentTime = appointmentTime; }
    public Patient getPatient() { return patient; }
    public void setPatient(Patient patient) { this.patient = patient; }
    public Doctor getDoctor() { return doctor; }
    public void setDoctor(Doctor doctor) { this.doctor = doctor; }
}
