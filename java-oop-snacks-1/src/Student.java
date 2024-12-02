// Class Definition

public class Student {

    // Instance Variables Declaration

    private String firstName;
    private String lastName;
    private int age;


    //


    // Student Methods

    public Student(String firstName, String lastName, int age) {

        this.firstName = firstName;
        
        this.lastName = lastName;

        this.age = age;

    }

    public String getInfo() {
        return (firstName + " " + lastName + ", " + age + " anni.");
    }

    //

}

//
