package WS_7;

public class Main {
    public static void main(String[] args) {
        // Create objects
        Patient patient = new Patient();
        patient.name = "Smarika";
        patient.age = 19;
        patient.gender = "Female";
        patient.address = "Kathmandu";
        patient.contactDetails = "9800000000";

        Doctor doctor = new Doctor();
        doctor.name = "Dr. Rohan";
        doctor.setDepartment("Cardiology");

        Treatment treatment = new Treatment();
        treatment.setType("Medication");
        treatment.setDescription("Take twice daily");

        Appointment appointment = new Appointment();
        appointment.setPatient(patient);
        appointment.setDoctor(doctor);
        appointment.setAppointmentDate("2026-01-10");
        appointment.setAppointmentTime("10:00 AM");

        // Test
        System.out.println("=== Patient Books Appointment ===");
        patient.bookAppointment(doctor, appointment);

        System.out.println("\n=== Doctor Views Patient Details ===");
        doctor.seePatientDetails(patient);

        System.out.println("\n=== Doctor Prescribes Treatment ===");
        doctor.prescribeTreatment(patient, treatment);

        System.out.println("\n=== Appointment Details ===");
        appointment.viewAppointmentDetails();

        System.out.println("\n=== Treatment Details ===");
        treatment.viewTreatmentDetails();
    }
}
