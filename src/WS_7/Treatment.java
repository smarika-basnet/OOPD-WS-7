package WS_7;

/**
 * Represents a treatment prescribed to a patient
 */
public class Treatment {
    private int treatmentID;
    private String type;
    private String description;

    /** Update treatment description */
    public void updateDescription(String newDescription) {
        this.description = newDescription;
        System.out.println("Treatment description updated: " + description);
    }

    /** View treatment details */
    public void viewTreatmentDetails() {
        System.out.println("Treatment ID: " + treatmentID);
        System.out.println("Type: " + type);
        System.out.println("Description: " + description);
    }

    // Getters & Setters
    public int getTreatmentID() { return treatmentID; }
    public void setTreatmentID(int treatmentID) { this.treatmentID = treatmentID; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
