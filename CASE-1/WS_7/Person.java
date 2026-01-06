package WS_7;

/**
 * Parent class representing a person in the hospital system
 */
public class Person {
    protected int personID;
    protected String name;
    protected int age;
    protected String gender;
    protected String address;
    protected String contactDetails;

    /** View personal details of the person */
    public void viewPersonalDetails() {
        System.out.println("Person ID: " + personID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Contact: " + contactDetails);
    }
}
