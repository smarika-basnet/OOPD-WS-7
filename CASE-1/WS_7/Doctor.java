package WS_7;

/**
 * Doctor class inherits from Person
 */
public class Doctor extends Person {
    private int doctorID;
    private String department;

    /** View patient details */
    public void seePatientDetails(Patient patient) {
        System.out.println("Doctor " + name + " is viewing patient details:");
        patient.viewPersonalDetails();
    }

    /** Prescribe a treatment to a patient */
    public void prescribeTreatment(Patient patient, Treatment treatment) {
        System.out.println("Doctor " + name + " prescribed " + treatment.getType() +
                " to patient " + patient.name);
    }

    // Getters & Setters
    public int getDoctorID() { return doctorID; }
    public void setDoctorID(int doctorID) { this.doctorID = doctorID; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getName() { return name; }
}
